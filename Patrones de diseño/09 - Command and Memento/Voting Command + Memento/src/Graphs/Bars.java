package Graphs;
/**
 * @author Victor Lavalle
 */
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import Patterns.observer.Observer;
import org.jfree.data.category.CategoryDataset;

public class Bars extends JFrame implements Observer{
    
    private CategoryDataset createDataset(String[] nominees, int[ ]votes){
       final  DefaultCategoryDataset result = new DefaultCategoryDataset();
         for(int i=0;i<nominees.length;i++){
                 result.addValue(votes[i], nominees[i],"");
         }
        return result;
    }
    public void Graph(ChartPanel chartpanel){ 
        chartpanel.setPreferredSize(new  java.awt.Dimension(500,500));
        this.setSize(400, 300);
        this.setLocation(105,20);
        this.setContentPane(chartpanel);
        this.setVisible(true);
    }
    
    @Override
    public void update(String []nominees,int[]votes) { 
      JFreeChart barChart = ChartFactory.createBarChart("Command + Memento", "Nominees","Votes",
      createDataset(nominees,votes ),PlotOrientation.VERTICAL, true, true, false);
      ChartPanel chartPanel = new ChartPanel( barChart );
      Graph(chartPanel);
    }
}
