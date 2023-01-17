package com.escuela.v0;

import java.util.Objects;

public class Estudiante {

	String nombre;
	int edad;
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
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		Estudiante other = (Estudiante) obj;
		return matricula.equals(other.matricula);
	}

	
}
