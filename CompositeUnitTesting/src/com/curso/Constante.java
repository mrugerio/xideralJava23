package com.curso;

public class Constante extends Expresion {
	
	double d;

	public Constante(double d) {
		this.d = d;
	}

	@Override
	protected double getValor() {
		return d;
	}

}
