package com.curso.V5;

public class AguilaCalva extends Aguila {

	String tipo = "AguilaCalva";

	@Override
	public void volar() {
		System.out.println("Volar como Aguila Calva ");
	}
	
	public void comerAguilaCalva() {
		System.out.println("Comer como AguilaCalva");
	}
}
