package Pattern;

import java.util.ArrayList;

import Model.IClonable;

public class Caretaker<E extends IClonable> { 

	private final ArrayList<Memento<E>> mementos = new ArrayList<>();
	
	public int currentIndex = -1;
	
	public Memento<E> undo() {
		return getMemento(currentIndex-1, -1);
	}
	
	public Memento<E> redo() {
		return getMemento(currentIndex+1, +1);
	}
	
	public Memento<E> getMemento(int index, int add) {
		if(index < mementos.size()) {
			currentIndex=currentIndex + add;
			return mementos.get(currentIndex);	
		} 
		return mementos.get(mementos.size()-1);
	}
	
	public Memento<E> getMemento(int index) {
		if(index < mementos.size()) {
			return mementos.get(index);	
		}
		return mementos.get(mementos.size()-1);
	}

	public Memento<E> getLastMemento() {
		return getMemento(mementos.size()-1);
	}
	
	public void addMemento(Memento<E> memento) {
		mementos.add(currentIndex+1,memento);
		currentIndex++;
	}
}
