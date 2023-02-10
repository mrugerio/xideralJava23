package Patterns.observer;

import java.util.ArrayList;
/**
 * @author Victor Lavalle
 */
public abstract class Observed {
    
    ArrayList<Observer> observers= new ArrayList();
    
    public  void addObserver(Observer observer){
        observers.add(observer);
    }
    
    public void deleteObserver(int index){
        observers.remove(index);
    }
    
    public void notifyAll(String []nominees,int[]votos){
        for(int i=0;i<observers.size();i++){
            observers.get(i).update(nominees,votos);
         }
    }
  
}
