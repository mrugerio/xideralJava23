package com.curso.v4;

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
		
		//CLASES ANONIMAS
		Comparator<Estudiante> comparatorEdad = new Comparator<>() {
			@Override
			public int compare(Estudiante o1, Estudiante o2) {
				return o2.getEdad() - o1.getEdad();
			}
		};

		Collections.sort(estudiantes, comparatorEdad);
		estudiantes.forEach(System.out::println);
		
		System.out.println("--------------");
		
		Comparator<Estudiante> comparatorNombre = new Comparator<>() {
			@Override
			public int compare(Estudiante o1, Estudiante o2) {
				return o2.getNombre().compareTo(o1.getNombre());
			}
		};
		
		Collections.sort(estudiantes, comparatorNombre);
		estudiantes.forEach(System.out::println);
		
		System.out.println("--------------");
		
		Comparator<Estudiante> comparatorPromedio = new Comparator<>() {
			@Override
			public int compare(Estudiante o1, Estudiante o2) {
				return (int)(((o1.getPromedio())*1000)-((o2.getPromedio())*1000));
			}
		};
		
		Collections.sort(estudiantes, comparatorPromedio);
		estudiantes.forEach(System.out::println);
		
		
	}

}
