package com.curso.v4;

public class Division extends Operacion {
	
	public Division(int x, int y) {
		super(x,y);
	}
	
	int ejecuta() {
		return x/y;
	}

	@Override
	public String toString() {
		return "Division [x=" + x + ", y=" + y + "]";
	}
	
}
