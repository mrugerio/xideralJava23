package com.curso.v7;

public class Pato implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Cerrar al pato");
	}

	@Override
	public String toString() {
		return "Pato []";
	}

}
