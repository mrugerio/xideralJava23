package com.curso.v2;

public class Division extends ExpresionAbs {
	
	public Division(Expresion left, Expresion right) {
		super(left, right);
	}

	@Override
	public double getValor() {
		return left.getValor() / right.getValor();
	}

}

