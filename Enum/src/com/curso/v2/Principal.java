package com.curso.v2;

public class Principal {

	public static void main(String[] args) {

		Estacion e = Estacion.VERANO;
		
		//System.out.println(e);
		//System.out.println(e==Estacion.OTOÑO);
		
		for (Estacion est : Estacion.values()) {
			System.out.println(est);
			System.out.println(est.mostrarVisEsperados());
		}
		
		System.out.println("---------------");
		
		switch(e) {
		case PRIMAVERA:
			System.out.println("Estación Primavera");
			break;
		case INVIERNO:
			System.out.println("Estación Invierno");
			break;
		case OTOÑO:
			System.out.println("Estación Otoño");
			break;
		default:
			System.out.println("Estación Verano");
		}
		
		
		
		
	}

}
