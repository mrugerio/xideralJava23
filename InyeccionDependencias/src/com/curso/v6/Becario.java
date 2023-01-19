package com.curso.v6;

public class Becario {
	
	//HAS-A
	String nombre;
	
	//«No me llame. Ya le llamaré yo«. //SI SE CUMPLE
	//BAJO ACOPLAMIENTO
	//AGENTE EXTERNO DEBE INYECTAR EL OBJETO A LA VARIABLE DE REFERENCIA
	private Computadora computadora;


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
	
	public Computadora getComputadora() {
		return computadora;
	}

	public void setComputadora(Computadora computadora) {
		this.computadora = computadora;
	}
	
}
