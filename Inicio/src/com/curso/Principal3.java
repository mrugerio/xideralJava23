package com.curso;

public class Principal3 {

	public static void main(String[] args) {

		String s = "Hola";
		int x = 5;
		StringBuilder sb = new StringBuilder("Hello");
		
		ejecuta(s,x,sb);
		
		System.out.println(s); //*Hola* //Hola mundo
		System.out.println(x); //*5* //10
		System.out.println(sb); //*Hello world* //Hello
		
		s = otroEjecuta(s,x,sb);
		
		System.out.println(s); //HolaHello world5
	}
	
	static void ejecuta(String s,int x,StringBuilder sb) {
		
		s.concat(" mundo");
		x = x + 5;
		sb.append(" world");
		
		System.out.println(s); //Hola
		System.out.println(x); //10
		System.out.println(sb); //Hello world
	}
	
	static String otroEjecuta(String s,int x,StringBuilder sb) {
		return s.concat(sb.toString()+x);
	}

}
