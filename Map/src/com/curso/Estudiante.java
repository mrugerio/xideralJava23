package com.curso;

import java.util.Objects;

//POJO (PLAIN OLD JAVA OBJECT)
public class Estudiante {

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

	@Override
	public int hashCode() {
		return nombre.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(promedio) == Double.doubleToLongBits(other.promedio);
	}

	

	
	
	


	
}
