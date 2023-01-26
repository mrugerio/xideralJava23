package com.curso.v2;

public class Suma extends ExpresionAbs {
	
	public Suma(Expresion left, Expresion right) {
		super(left, right);
	}

	@Override
	public double getValor() {
		return left.getValor() + right.getValor();
	}

}