package com.curso;

public class Division extends Expresion {
	
	Expresion left, right;

	public Division(Expresion left, Expresion right) {
		this.left = left;
		this.right = right;
	}

	@Override
	protected double getValor() {
		return left.getValor() / right.getValor();
	}

}

