package Launcher;

import Methods.CSVGenerator;
import Graphs.Bars;
import Graphs.Circle;
import Patterns.observer.Observed;
import View.UIvotes;
/**
 * @author Victor Lavalle
 */
public class Client {

    public static void main(String[] args) {
        
       Observed observer = new Observed() {};
       CSVGenerator csv = new CSVGenerator();
       Bars b =  new Bars();
       Circle c= new Circle();
       observer.addObserver(csv);
       observer.addObserver(b);
       observer.addObserver(c);
       UIvotes  ui= new UIvotes ();
       ui.setOb(observer);
       ui.setVisible(true);
    }  
}
