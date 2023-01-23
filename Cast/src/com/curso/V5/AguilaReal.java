package com.curso.V5;

public class AguilaReal extends Aguila {

	String tipo = "AguilaReal";

	@Override
	public void volar() {
		System.out.println("Volar como Aguila Real ");
	}
	
	public void comerAguilaReal() {
		System.out.println("Comer como AguilaReal");
	}
}
