package com.curso.v2;

public class Multi extends ExpresionAbs {
	
	public Multi(Expresion left, Expresion right) {
		super(left, right);
	}

	@Override
	public double getValor() {
		return left.getValor() * right.getValor();
	}

}