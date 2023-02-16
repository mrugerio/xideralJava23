package Model;

import java.util.Set;

public interface IObserver<E> {
	public void actualizar(Set<? extends E> elementosDeGrafica);
}
