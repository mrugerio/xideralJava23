package Controller;
/**
 * @author Victor Lavalle
 * This project was made base in:
 * http://lineadecodigo.com/java/graficos-de-torta-y-barras-con-jfreechart/
 */
import Model.*;
import View.MainVotingFRM;
import javax.swing.JFrame;

public class Controller {
    private MainVotingFRM view;
    private Nominees Opt1;
    private Nominees Opt2;
    private Nominees Opt3;
    private BarGraph bars;
    private CircleGraph circle;
    private JFrame windowBars;
    private JFrame windowCircle;

    //Methods Get
    public JFrame getWindowBars() {return windowBars;}
    public JFrame getWindowCircle() { return windowCircle; }
    public BarGraph getBars() { return bars; }   
    public CircleGraph getCircle() {return circle; }
    public MainVotingFRM getView() { return view; }  
    public Nominees getOpt1() { return Opt1; }
    public Nominees getOpt2() { return Opt2; }
    public Nominees getOpt3() {return Opt3; }
    
    //Methods Set
    public void setWindowBars(JFrame windowBars) { this.windowBars = windowBars; }
    public void setWindowCircle(JFrame windowCircle) {this.windowCircle =windowCircle; }
    public void setBars(BarGraph bars) { this.bars = bars;}
    public void setCircle(CircleGraph circle) { this.circle = circle; }
    public void setView(MainVotingFRM view) { this.view = view; }
    public void setOpt1(Nominees Opt1) { this.Opt1 = Opt1;}
    public void setOpt2(Nominees Opt2) { this.Opt2 = Opt2; }
    public void setOpt3(Nominees Opt3) { this.Opt3 = Opt3; }
  
   //Constructor of good luck for the graphs :)
   public void GenerateGraph1(){ }
   public void GenerateGraph2(){ }
   
   /*
   *Functions that work with the 3 buttons of the mainframe
   *to pass parameters to create the graphs
   */
   public void Vote1(){
       this.Opt1.vote();
       this.bars.setWindow(windowBars);
       this.circle.setWindow(windowCircle);
       this.bars.data(Opt1, Opt2, Opt3);
       this.circle.data(Opt1, Opt2, Opt3);
    }
   
    public void Vote2(){
       this.Opt2.vote();
       this.bars.setWindow(windowBars);
       this.circle.setWindow(windowCircle);
       this.bars.data(Opt1, Opt2, Opt3);
       this.circle.data(Opt1, Opt2, Opt3);
    }
    
    public void Vote3(){
       this.Opt3.vote();
       this.bars.setWindow(windowBars);
       this.circle.setWindow(windowCircle);
       this.bars.data(Opt1, Opt2, Opt3);
       this.circle.data(Opt1, Opt2, Opt3);
    }
}