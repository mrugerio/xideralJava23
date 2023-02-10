package Graphs;

import java.util.Set;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import Model.IContable;

@SuppressWarnings("serial")
public class GraficaPie extends Grafica {

	public GraficaPie() {
		super.configureGrafica();
	}

	private DefaultPieDataset createDataset(Set<? extends IContable> elementosDeGrafica) {
		final DefaultPieDataset dataset = new DefaultPieDataset();
		elementosDeGrafica.forEach(t -> dataset.setValue(t.getNombre(), Double.valueOf(t.getCuenta())));
		return dataset;
	}

	public void actualizar(Set<? extends IContable> elementosDeGrafica) {

		JFreeChart barChart = ChartFactory.createPieChart("Votos", createDataset(elementosDeGrafica), true, true,
				false);
		ChartPanel chartPanel = new ChartPanel(barChart);
		chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
		setContentPane(chartPanel);
		update();
	}
}
