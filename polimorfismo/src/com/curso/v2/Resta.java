package com.curso.v2;

public class Resta extends Operacion {
	
	public Resta(int x, int y) {
		super(x,y);
	}
	
	int ejecuta() {
		return x-y;
	}

	@Override
	public String toString() {
		return "Resta [x=" + x + ", y=" + y + "]";
	}
	
}
