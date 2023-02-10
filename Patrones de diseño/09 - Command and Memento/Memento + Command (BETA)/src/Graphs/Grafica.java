package Graphs;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.IContable;
import Model.IObserver;

@SuppressWarnings("serial")
public abstract class Grafica extends JFrame implements IObserver<IContable> {

	protected JPanel contentPane;
	protected final JFrame frame = this;

	protected void configureGrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	protected void update() {
		super.invalidate();
		super.repaint();
		super.pack();
		super.validate();
	}
}
