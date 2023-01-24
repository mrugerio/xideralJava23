package com.curso.v3;

public class Principal {

	public static void main(String[] args) throws CeroException {

		int x = 5;
		int y = 0;
		int res = 0;
		
		calcularDiv(x,y);
		
//		try {
//			res = calcularDiv(x,y);
//		} catch (CeroException e) {
//			e.printStackTrace();
//		}
		
		System.out.println(res);
		System.out.println("Fin exitoso");
	}
	
	
	

	private static int calcularDiv(int x, int y) throws CeroException {
		if (y==0)
			throw new CeroException("No se puede dividir entre 0");
		return x/y;
	}

}
