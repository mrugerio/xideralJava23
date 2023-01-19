package com.curso.v12;

public class Division extends OperacionAbs {
	
	public Division(int x, int y) {
		super(x,y);
	}
	
	@Override
	public int ejecuta() {
		return x/y;
	}
	
}