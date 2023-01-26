package com.curso.v2;

public class Resta extends ExpresionAbs {
	
	public Resta(Expresion left, Expresion right) {
		super(left, right);
	}

	@Override
	public double getValor() {
		return left.getValor() - right.getValor();
	}

}
