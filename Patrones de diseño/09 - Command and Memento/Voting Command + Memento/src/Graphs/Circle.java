package Graphs;
/**
 * @author Victor Lavalle
 */
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import Patterns.observer.Observer;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.util.Rotation;


public class Circle extends JFrame implements Observer{
    
    private PieDataset createDataset(String[] nominees, int[] votes){
        DefaultPieDataset result = new DefaultPieDataset();
         for(int i=0;i<nominees.length;i++){
                 result.setValue(nominees[i], votes[i]);
         }
        return result;
    }
    
    private JFreeChart createChart(PieDataset dataset, String title){
        JFreeChart chart = ChartFactory.createPieChart3D(title, dataset,true,true,false);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
     return chart;
    }

    public void Graph(ChartPanel chartpanel){
        chartpanel.setPreferredSize(new  java.awt.Dimension(500,500));
        this.setSize(400, 300);
        this.setLocation(860,20);
        this.setContentPane(chartpanel);
        this.setVisible(true);
    
    }

    @Override
    public void update( String []nominees, int[]votes) {
    PieDataset dataset = createDataset(nominees,votes);
    JFreeChart chart = createChart(dataset,"Voting Command + Observer");
    ChartPanel chartPanel = new  ChartPanel(chart);
    Graph(chartPanel); 
    }
}
