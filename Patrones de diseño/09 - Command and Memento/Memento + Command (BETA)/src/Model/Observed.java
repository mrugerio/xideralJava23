package Model;

import java.util.ArrayList;
import java.util.Set;

public class Observed<E> {

	protected ArrayList<IObserver<E>> observers = new ArrayList<IObserver<E>>();

	public void actualizarTodos(Set<? extends E> contable) {
		observers.forEach(t -> t.actualizar(contable));
	}

	public void addObserver(IObserver<E> observer) {
		observers.add(observer);
	}

	public void removeObserver(IObserver<E> observer) {
		observers.remove(observer);
	}
}
