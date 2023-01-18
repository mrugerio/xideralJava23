package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		Operacion ope1 = new Suma(8,4);
		Operacion ope2 = new Resta(8,4);
		
		System.out.println(ope1);
		System.out.println(ope1.ejecuta()); //12
		System.out.println(ope2);
		System.out.println(ope2.ejecuta()); //4
	}

}
