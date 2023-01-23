package com.curso.V5;

class Aguila extends Ave {

	String tipo = "Aguila";

	@Override
	public void volar() {
		System.out.println("Volar como Aguila");
	}
	
	public void comerAguila() {
		System.out.println("Comer como Aguila");
	}
}
