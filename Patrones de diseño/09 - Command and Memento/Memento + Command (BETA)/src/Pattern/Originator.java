package Pattern;

import Model.IClonable;

public class Originator<E extends IClonable> {

	private E estado;

	public E getEstado() {
		return estado;
	}

	public void setEstado(IClonable estado) {
		this.estado = (E) estado.cloneThis();
	}

	public Memento<E> guardar() {
		return new Memento<E>(estado);
	}

	public void restaurar(Memento<E> m) {
		this.estado = (E) m.getEstado().cloneThis();
	}
}
