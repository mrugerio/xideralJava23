package com.curso.v9;

public class Potencia implements Operacion {
	
	int x;
	int y;
	
	public Potencia(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int ejecuta() {
		return (int)Math.pow(x, y);
	}

	@Override
	public String toString() {
		return "Potencia [x=" + x + ", y=" + y + "]";
	}
	
}

