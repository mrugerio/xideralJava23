package Pattern;

import Model.IClonable;

public class Memento<E extends IClonable> {

	public E estado;

	public Memento(E estado) {
		this.estado = estado;
	}

	public E getEstado() {
		return estado;
	}

	public void setEstado(E estado) {
		this.estado = estado;
	}
}
