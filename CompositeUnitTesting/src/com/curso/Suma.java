package com.curso;

public class Suma extends Expresion {
	
	Expresion left, right;

	public Suma(Expresion left, Expresion right) {
		this.left = left;
		this.right = right;
	}

	@Override
	protected double getValor() {
		return left.getValor() + right.getValor();
	}

}
