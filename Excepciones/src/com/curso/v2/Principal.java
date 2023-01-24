package com.curso.v2;

public class Principal {

	public static void main(String[] args) {

		int x = 5;
		int y = 0;
		int res = 0;
		
		try {
			res = calcularDiv(x,y);
		}catch(ArithmeticException e) {
			System.out.println("No se puede dividir entre 0");
		}finally {
			System.out.println("Pasa por el Finally");
		}
		
		System.out.println(res);
		
		System.out.println("Programa exitoso");
	}

	private static int calcularDiv(int x, int y) {
		return x/y;
	}

}
