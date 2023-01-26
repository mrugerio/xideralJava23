package com.curso;

public class Multi extends Expresion {
	
	Expresion left, right;

	public Multi(Expresion left, Expresion right) {
		this.left = left;
		this.right = right;
	}

	@Override
	protected double getValor() {
		return left.getValor() * right.getValor();
	}

}
