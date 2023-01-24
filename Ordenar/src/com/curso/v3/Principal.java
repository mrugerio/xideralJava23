package com.curso.v3;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		List<Estudiante> estudiantes = new ArrayList<>();
		estudiantes.add(new Estudiante("Juan", 18, 8.5));
		estudiantes.add(new Estudiante("Maria", 20, 9.1));
		estudiantes.add(new Estudiante("Pedro", 22, 7.8));
		estudiantes.add(new Estudiante("Ana", 19, 9.2));
		estudiantes.add(new Estudiante("Luis", 21, 8.3));
		estudiantes.add(new Estudiante("Sofia", 20, 9.5));
		estudiantes.add(new Estudiante("Carlos", 18, 7.2));
		estudiantes.add(new Estudiante("Isabella", 19, 8.9));
		estudiantes.add(new Estudiante("Fernando", 21, 7.5));
		estudiantes.add(new Estudiante("Valeria", 20, 9.1));
		estudiantes.add(new Estudiante("Jorge", 18, 8.7));
		estudiantes.add(new Estudiante("Gabriela", 19, 9.3));
		estudiantes.add(new Estudiante("Diego", 21, 8.0));
		estudiantes.add(new Estudiante("Paula", 20, 9.0));
		estudiantes.add(new Estudiante("Alejandro", 18, 7.8));
		estudiantes.add(new Estudiante("Juliana", 19, 9.2));
		estudiantes.add(new Estudiante("Sebastian", 21, 8.5));
		estudiantes.add(new Estudiante("Camila", 20, 9.1));

		Collections.sort(estudiantes, new OrdenarEdad());
		estudiantes.forEach(System.out::println);
		
		System.out.println("--------------");
		
		Collections.sort(estudiantes, new OrdenarNombre());
		estudiantes.forEach(System.out::println);
		
		
	}

}
