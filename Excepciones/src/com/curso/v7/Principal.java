package com.curso.v7;

public class Principal {

	public static void main(String[] args) {

		Pato pato = null;
		try {
			pato = new Pato();
		}finally {
			try {
				pato.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Paso por Finally");
		}
	}

}
