package com.curso.v12;

public class Suma extends OperacionAbs {
	
	public Suma(int x, int y) {
		super(x,y);
	}
	
	@Override
	public int ejecuta() {
		return x+y;
	}
	
}
