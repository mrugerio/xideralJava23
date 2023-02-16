package Model;
/**
 * @author Victor Lavalle
 */
import java.awt.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarGraph {
    
    JFrame Window;
    JFreeChart Graph;
     public static final Color Lime = new Color(0x80,0xFF,0x00);
    
    //Methods Get & Set
    public JFrame getWindow() { return Window;}
    public JFreeChart getGraph() {return Graph; }
    
    public void setWindow(JFrame Window) {this.Window = Window;}
    public void setGraph(JFreeChart Graph) {this.Graph = Graph;}
    
    //Function that conatins the data fot the graph
    public void data(Nominees Opt1,Nominees Opt2,Nominees Opt3){
        
        DefaultCategoryDataset Data = new DefaultCategoryDataset();
         Data.addValue(Opt1.getVotes(), Opt1.getName(), Opt1.getName());
         Data.addValue(Opt2.getVotes(), Opt2.getName(), Opt2.getName());
         Data.addValue(Opt3.getVotes(), Opt3.getName(), Opt3.getName());

        Graph = ChartFactory.createBarChart3D("Results","Nominees", "Votes", Data,PlotOrientation.VERTICAL, true, true, false);
        Graph.setBackgroundPaint(Lime);
        ChartPanel Panel = new ChartPanel(Graph);
        Window.getContentPane().add(Panel);
        Window.pack();
        Window.setVisible(true);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}