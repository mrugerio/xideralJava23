package com.curso.V5;

public class Principal {

	public static void main(String[] args) {

		AguilaReal aguilaReal = new AguilaReal();
		System.out.println(aguilaReal.tipo); //AguilaReal
		aguilaReal.volar(); //aguilaReal
		
		Aguila aguila = aguilaReal;
		System.out.println(aguila.tipo); //Aguila
		aguila.volar(); //aguilaReal
		
		Ave ave = aguila;
		System.out.println(ave.tipo); //Ave
		ave.volar(); //aguilaReal
	
		
	}

}
