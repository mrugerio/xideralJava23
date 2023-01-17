package com.escuela;

import java.util.Objects;

public class Estudiante {
	
	//OJO: Hasta Java 8
	//public //Todo mundo
	//protected //Mismo Paquete y Clases Derivadas
	//default *No se escribe* //Mismo Paquete
	//        Privated Protected
	//private //Solo la clase

	protected String nombre; 
	protected int edad;
	StringBuilder matricula;
	boolean mayorEdad;
	
	
	public Estudiante(String nombre, int edad, StringBuilder matricula, boolean mayorEdad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.matricula = matricula;
		this.mayorEdad = mayorEdad;
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

	public StringBuilder getMatricula() {
		return matricula;
	}

	public void setMatricula(StringBuilder matricula) {
		this.matricula = matricula;
	}

	public boolean isMayorEdad() {
		return mayorEdad;
	}

	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad = mayorEdad;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", matricula=" + matricula + ", mayorEdad="
				+ mayorEdad + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Estudiante other = (Estudiante) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
	
}
