package com.curso.v7;

public class Principal2 {

	public static void main(String[] args) {

		try (Pato pato = new Pato()) {
			System.out.println(pato);
			//getExcepcion();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Fin de Programa");
	}

	private static void getExcepcion() throws Exception {
		throw new Exception("Excepcion generada");
	}

}
