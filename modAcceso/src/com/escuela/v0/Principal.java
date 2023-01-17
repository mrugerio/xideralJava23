package com.escuela.v0;

public class Principal {

	public static void main(String[] args) {
		
		String nombre1 = new String("Epeneto");
		String nombre2 = new String("Epeneto");
		
		StringBuilder sb = new StringBuilder("XYZ20");

		Estudiante e1 = new Estudiante(nombre1,20,sb,true);
				
		Estudiante e2 = new Estudiante(nombre2,25,sb,false);
		
		System.out.println(e1.equals(e2)); //true

	}

}
