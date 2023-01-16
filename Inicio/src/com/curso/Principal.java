package com.curso;

public class Principal {

	public static void main(String[] args) {

		String x = "hola";
		String y = "hola";
		String z = "hola";
		
		//x = "hello";
		
		// == Verificar si las variables de referencia
		// apuntan al mismo objeto
		System.out.println("15:"+(y==x)); //true
		
		//Objetos 3  *1*
		//Variables referencia=3
		
		String w = new String("hola"); //se crean 2 objetos???
		System.out.println("21:"+(y==w)); //false
		
		//Objetos 4 *2*
		//Variables referencia=4
		
		//x = null;
		//Objeto vacio *incorrecto*
		//Objetos 4 *2*
		
		//x.concat(" mundo");
		//System.out.println(x); //hola mundo *hola*
		
		System.out.println(x.equals(w)); //*true* false
	
		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder("hello");
		
		System.out.println(sb1.equals(sb2)); //true *false* 
		
	}

}
