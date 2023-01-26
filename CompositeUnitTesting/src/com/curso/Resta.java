package com.curso;

public class Resta extends Expresion {
	
	Expresion left, right;

	public Resta(Expresion left, Expresion right) {
		this.left = left;
		this.right = right;
	}

	@Override
	protected double getValor() {
		return left.getValor() - right.getValor();
	}

}

