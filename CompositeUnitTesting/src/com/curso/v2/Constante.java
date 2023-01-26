package com.curso.v2;

public class Constante implements Expresion {
	
	double d;

	public Constante(double d) {
		this.d = d;
	}

	@Override
	public double getValor() {
		return d;
	}

}
