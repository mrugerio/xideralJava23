package com.demo;

public class FinalDemo{

	public static void main(String[] args) {

		final String cadena = "Hello";
		
		//NO SE PUEDE CAMBIAR LA REFERENCIA
		//cadena = "Hola";
		
		System.out.println(cadena);
		
		final StringBuilder sb = new StringBuilder("Hello");
		
		sb.append(" World");
		
		System.out.println(sb);
		
		//NO SE PUEDE CAMBIAR LA REFERENCIA
		//sb = new StringBuilder("hola");
		
	}

}
