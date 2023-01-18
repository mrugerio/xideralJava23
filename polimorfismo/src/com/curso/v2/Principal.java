package com.curso.v2;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Suma ope1 = new Suma(8,4);
		Resta ope2 = new Resta(8,4);
		
		ArrayList<Operacion> lista = new ArrayList<>();
		
		lista.add(ope1);
		lista.add(ope2);
		
		show(lista);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	static void show(ArrayList<Operacion> lista) {
	
		for (int x=0;x <lista.size();++x) {
			
			Operacion ope = lista.get(x);
			System.out.println(ope);
			System.out.println(ope.ejecuta());
			
		}
	}
}
