package com.curso.v0;

public class Becario {
	
	//HAS-A
	String nombre;
	
	//«No me llame. Ya le llamaré yo«. //NO SE CUMPLE
	//ALTO ACOPLAMIENTO
	CompuWindows computadora = new CompuWindows("Vista");
	
	public Becario(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Becario [nombre=" + nombre + "]";
	}
	
	void encenderCompu() {
		System.out.println(nombre);
		computadora.prender();
	}
	
	
}
