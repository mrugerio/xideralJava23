package com.curso.v2;

public abstract class ExpresionAbs implements Expresion {

	Expresion left, right;

	public ExpresionAbs(Expresion left, Expresion right) {
		this.left = left;
		this.right = right;
	}
}
