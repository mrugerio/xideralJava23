package com.curso.v7;

//NO SE PUEDEN CREAR OBJETOS DE CLASES ABSTRACTAS
public abstract class Operacion {
	
	int x;
	int y;
	
	public Operacion(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//METODOS SIN COMPORTAMIENTO
	//LAS SUBCLASES ESTAN OBLIGADAS A DEFINIR EL COMPORTAMIENTO
	abstract int ejecuta();

	@Override
	public String toString() {
		return this.getClass().getSimpleName()
				+"[x=" + x + ", y=" + y + "]";
	}
}
