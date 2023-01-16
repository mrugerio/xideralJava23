package com.curso;

public class Principal2 {
	
	public static void main(String[] args) {
		
		String s = "hola"; //INMUTABLE -> OBJETO
		StringBuilder sb = new StringBuilder("hello"); //MUTABLE -> OBJETO
		
		//s = "otro hola";
		
		//2 Objetos
		
		s = s.concat(" mundo");
		sb.append(" world");
		
		//3 Objetos
		
		System.out.println(s); //hola
		System.out.println(sb); //hello world
		
	}

}
