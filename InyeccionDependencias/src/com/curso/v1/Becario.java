package com.curso.v1;

public class Becario {
	
	//HAS-A
	String nombre;
	
	//«No me llame. Ya le llamaré yo«. //NO SE CUMPLE
	//ALTO ACOPLAMIENTO
	CompuWindows compuWindows = new CompuWindows("Vista");
	CompuLinux compLinux = new CompuLinux("Ubuntu 18");
	
	public Becario(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Becario [nombre=" + nombre + "]";
	}
	
	void encenderCompu(String tipoCompu) {
		System.out.println(nombre);
		if (tipoCompu=="linux")
			compLinux.prender();
		else
			compuWindows.prender();
	}
	
	
}
