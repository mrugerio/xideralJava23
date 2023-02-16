package Patterns.memento;

import java.util.LinkedList;
/**
 * @author Victor Lavalle
 */
public class CareTaker {
    
    private final LinkedList<Memento>mementos= new LinkedList<>();
    
    public void addMemento(Memento memento){
        mementos.addLast(memento);
    }
    
    public Memento getMemento(){
       return mementos.getLast();
    }
}
