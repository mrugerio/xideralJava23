package com.curso.v6;

public class Potencia extends Operacion {
	
	public Potencia(int x, int y) {
		super(x,y);
	}
	
	int ejecuta() {
		return (int)Math.pow(x, y);
	}

	@Override
	public String toString() {
		return "Potencia [x=" + x + ", y=" + y + "]";
	}
	
}
