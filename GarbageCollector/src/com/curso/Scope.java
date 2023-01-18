package com.curso;

public class Scope {

	public static void main(String[] args) {

		String one, two;
		//Objetos = 0;
		one = new String("a");
		two = new String("b");
		//Objetos = 2;
		one = two;
		//Objetos = // NO SABEMOS //1 ó 2
		String three = one;
		//Objetos = // NO SABEMOS //1 ó 2
		one = null;
		//Esperaria solo tener 1 Objeto
	}

}
