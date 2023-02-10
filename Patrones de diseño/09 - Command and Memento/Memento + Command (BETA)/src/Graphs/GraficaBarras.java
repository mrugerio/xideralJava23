package Graphs;

import java.util.Set;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import Model.IContable;


@SuppressWarnings("serial")
public class GraficaBarras extends Grafica {

	public GraficaBarras() {
		super.configureGrafica();
	}

	private CategoryDataset createDataset(Set<? extends IContable> elementosDeGrafica) {
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		elementosDeGrafica.forEach(t -> dataset.addValue(t.getCuenta(), t.getNombre(), "Candidatos"));
		return dataset;
	}

	@Override
	public void actualizar(Set<? extends IContable> elementosDeGrafica) {
		JFreeChart barChart = ChartFactory.createBarChart("Votos", "Category", "Score",
				createDataset(elementosDeGrafica), PlotOrientation.VERTICAL, true, true, false);
		ChartPanel chartPanel = new ChartPanel(barChart);
		chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
		setContentPane(chartPanel);
		update();
	}
}
