package com.curso;

import com.escuela.Estudiante;

public class Alumno extends Estudiante {
	
	Alumno(){
		this("SinNombre",0,new StringBuilder("XXYY"),false);
	}

	Alumno(String nombre, int edad, StringBuilder matricula, boolean mayorEdad){
		super(nombre,edad, matricula,mayorEdad);
	}
	
	String dameNombre(){
		System.out.println(nombre);
		return nombre;
	}
	
	int dameEdad(){
		System.out.println(edad);
		return edad;
	}
}
