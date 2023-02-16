package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.*;
import Pattern.*;
import Graphs.*;


public class MainUI extends Observed<IContable> {

	
	public List<JFrame> jFrames = new ArrayList<JFrame>();	
	private Caretaker<ClonableHashSet<IVotable>> caretaker = new Caretaker<ClonableHashSet<IVotable>>();
	private Originator<ClonableHashSet<IVotable>> originator = new Originator<ClonableHashSet<IVotable>>();
	private ClonableHashSet<IVotable> votos = new ClonableHashSet<IVotable>();
	
	private CommandVotar commandVotar = new CommandVotar() {
		@Override
		public void votar(String voto) {
			votos.forEach(votable -> {
				if (votable.getNombre().equalsIgnoreCase(voto)) {
					votable.votar();
				}
			});
			originator.setEstado(votos);
			caretaker.addMemento(originator.guardar());
			actualizarTodos(votos);
		}
	};
	
	public MainUI() {
		Votable amloVotable = new Votable("AMLO", Color.BLUE);
		Votable trumpVotable = new Votable("Trump", Color.GREEN);
		Votable trudeVotable = new Votable("Trudeau", Color.RED);
		votos.add(trudeVotable);
		votos.add(trumpVotable);
		votos.add(amloVotable);
		
		originator.setEstado(votos);
		caretaker.addMemento(originator.guardar());
		
		
		CsvExporter csv = new CsvExporter("votos.csv");
		GraficaPie graficaPie = new GraficaPie();
		GraficaBarras graficaBarras = new GraficaBarras();
		JFrame menu = getMenu();

		jFrames.add(graficaBarras);
		jFrames.add(graficaPie);
		jFrames.add(menu);
		jFrames.forEach(t -> t.setVisible(true));

		addObserver(csv);
		addObserver(graficaPie);
		addObserver(graficaBarras);
	}

	public static void main(String[] args) {
		new MainUI();
	}

	public JFrame getMenu() {
		JFrame jFrame = new JFrame();
		JPanel contentPane;
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		jFrame.setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		JComboBox comboBoxVotables = new JComboBox();
		contentPane.add(comboBoxVotables);
		originator.getEstado().forEach(t -> comboBoxVotables.addItem(t.getNombre()));
		
		
		JButton btnVotar = new JButton("Votar");
		btnVotar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedString = comboBoxVotables.getSelectedItem().toString();
				System.out.println(selectedString);
				commandVotar.votar(selectedString);
			}
		});
		contentPane.add(btnVotar);
		
		JButton btnZ = new JButton("<-");
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				originator.restaurar(caretaker.undo());
				votos = originator.getEstado();
				actualizarTodos(votos);
			}
		});
		contentPane.add(btnZ);
		return jFrame;
	}
}
