package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		int x = 5;
		int y = 0;
		int res = 0;
		
		res = calcularDiv(x,y);
		System.out.println(res);
		
		System.out.println("Programa exitoso");
	}

	private static int calcularDiv(int x, int y) {
		return x/y;
	}

}
