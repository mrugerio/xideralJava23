package com.curso;

public class Principal {

	public static void main(String[] args) {

		Ave ave1 = new Aguila();
		Ave ave2 = new AguilaCalva();
		
		ave1.volar();
		ave2.volar();
		
		ave2.comerAve(); //SI PUEDE 
		
		//LOS COMPORTAMIENTOS LO DEFINE 
		//LA VARIABLE DE REFERENCIA
		//ave2.comerAguilaCalva(); //NO SE PUEDE
		
		//AguilaCalva ac = (AguilaCalva)ave2;
		//ac.comerAguilaCalva();
		System.out.println("----------");
		((AguilaCalva)ave2).comerAguilaCalva();
		
		
	}

}
