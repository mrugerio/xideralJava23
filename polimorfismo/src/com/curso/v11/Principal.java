package com.curso.v11;

import java.util.ArrayList;

//DEMO instanceOf
public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Operacion> lista = new ArrayList<>();
		
		lista.add(new Potencia(8,5));
		lista.add(new Suma(8,4));
		lista.add(new Resta(8,4));
		lista.add(new Division(8,4));
		lista.add(new Potencia(8,4));
		lista.add(new Multi(8,4));
		lista.add(new Potencia(2,4));

		
		show(lista);
		
	}
	
	
	static void show(ArrayList<Operacion> lista) {
		for (Operacion ope:lista) { //forEach
			System.out.println(ope);
			System.out.println(ope.ejecuta());
		}
	}
	
//	static void show(ArrayList<Operacion> lista) {
//		for (int x=0;x <lista.size();++x) {
//			Operacion ope = lista.get(x);
//			System.out.println(ope);
//			System.out.println(ope.ejecuta());
//			
//		}
//	}
}
