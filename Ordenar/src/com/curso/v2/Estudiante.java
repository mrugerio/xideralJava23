package com.curso.v2;

public class Estudiante implements Comparable<Estudiante> {

	private String nombre;
	private int edad;
	private double promedio;
	
	public Estudiante(String nombre, int edad, double promedio) {
		this.nombre = nombre;
		this.edad = edad;
		this.promedio = promedio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", promedio=" + promedio + "]";
	}

//	@Override
//	public int compareTo(Estudiante o) {
//		return this.nombre.compareTo(o.nombre);
//		//return o.nombre.compareTo(this.nombre);
//	}

//	@Override
//	public int compareTo(Estudiante o) {
//		//SI EL PRIMER VALOR ES MAYOR REGRESA UN POSITIVO
//		if (this.edad > o.edad)
//			return 10;
//		//SI EL PRIMER VALOR ES MENOR REGRESA UN NEGATIVO
//		else if (this.edad < o.edad)
//			return -10;
//		//SI SON IGUALES REGRESA UN CERO
//		else
//			return 0;
//	}

//	@Override
//	public int compareTo(Estudiante o) {
//		return this.edad - o.edad;
//	}
	
	@Override
	public int compareTo(Estudiante o) {
		return (int)((o.promedio*1000) - (this.promedio*1000));
		//return (int)((this.promedio*1000) - (o.promedio*1000));
	}
	
	
}
