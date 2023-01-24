package com.curso.v0;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Estudiante e1 =new Estudiante("Juan", 18, 8.5);
		Estudiante e2 =new Estudiante("Maria", 20, 9.1);
		Estudiante e3 =new Estudiante("Pedro", 22, 7.8);
		Estudiante e4 =new Estudiante("Ana", 19, 9.2);
		Estudiante e5 =new Estudiante("Ana", 19, 9.2);
		
		Set<Estudiante> setEstudiantes = new HashSet<>();
		
		setEstudiantes.add(e1);
		setEstudiantes.add(e2);
		setEstudiantes.add(e3);
		setEstudiantes.add(e4);
		setEstudiantes.add(e5);
		
		System.out.println(e4.equals(e5)); //true
		
		setEstudiantes.forEach(System.out::println);

		
	}

}
