package Launcher;
/**
 * @author Victor Lavalle
 */
import Controller.Controller;
import Model.*;
import View.*;
import javax.swing.JFrame;

public class Launcher {
    
    public static MainVotingFRM view;
    public static JFrame windowBars;
    public static JFrame windowCircle;
    public static Nominees opt1;
    public static Nominees opt2;
    public static Nominees opt3;     
    public static Controller ctrl;
    public static BarGraph bars;
    public static CircleGraph circle;
    
    public static void main(String[] args) {
       
        opt1 = new Nominees("Discord");
        opt2 = new Nominees("Teams");
        opt3 = new Nominees("Zoom");
        
        bars= new BarGraph();
        circle= new CircleGraph();
        windowBars = new JFrame();
        windowCircle = new JFrame(); 
        ctrl= new Controller();
        view = new MainVotingFRM();
        
        //Controller
        ctrl.setOpt1(opt1);
        ctrl.setOpt2(opt2);
        ctrl.setOpt3(opt3);
        ctrl.setView(view);
        ctrl.setBars(bars);
        ctrl.setCircle(circle);
        ctrl.setWindowBars(windowBars);
        ctrl.setWindowCircle(windowCircle);
        view.setCtrl(ctrl);
        
        //Set the size of the windows that contains each graphs
        windowCircle.setSize(300,300);
        windowBars.setSize(300,300);
        
        //Set the location of the windows once a vote is made
        windowCircle.setLocation(-2,0);
        windowBars.setLocation(681,0);
        windowCircle.setVisible(true);
        windowBars.setVisible(true);
        view.setVisible(true);
      }
}
