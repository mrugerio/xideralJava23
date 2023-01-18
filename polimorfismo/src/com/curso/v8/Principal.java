package com.curso.v8;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Operacion> lista = new ArrayList<>();
		
		//lista.add(new Operacion(8,4));
		lista.add(new Suma(8,4));
		lista.add(new Resta(8,4));
		lista.add(new Division(8,4));
		lista.add(new Potencia(8,4));
		lista.add(new Multi(8,4));
		
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
