package com.curso.V4;

public class Principal {

	public static void main(String[] args) {

		
		AguilaReal aguilaReal = new AguilaReal();
		aguilaReal.comerAguilaReal();
		aguilaReal.volar(); //aguilaReal
		
		Aguila aguila = aguilaReal;
		//aguila.comerAguilaReal(); //NO SE PUEDE
		aguila.volar(); //aguilaReal
		
		Ave ave = aguila;
		//ave.comerAguilaReal(); //NO SE PUEDE
		ave.volar(); //aguilaReal
	
		
	}

}
