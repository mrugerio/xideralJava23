package Pattern;

import java.util.ArrayList;
/**
 * @author Victor Lavalle
 */
public class Observed {
    
protected ArrayList<Observer> observers;

 public Observed(){
 this.observers = new ArrayList<>();
 }

 public void notifyAll(int[] votes, String[] nominees){
     for (Observer observer : observers) {
         observer.update(votes, nominees);
     }
 }

 public void addObserver(Observer o){
    observers.add(o);
 }

 public void removeObserver(Observer o){
    observers.remove(o);
 }
 
}
