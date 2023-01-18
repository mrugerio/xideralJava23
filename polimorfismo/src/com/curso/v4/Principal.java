package com.curso.v4;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		Operacion ope0 = new Operacion(8,4);
		Suma ope1 = new Suma(8,4);
		Resta ope2 = new Resta(8,4);
		Division ope3 = new Division(8,4);
		
		ArrayList<Operacion> lista = new ArrayList<>();
		
		lista.add(ope0);
		lista.add(ope1);
		lista.add(ope2);
		lista.add(ope3);
		
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
