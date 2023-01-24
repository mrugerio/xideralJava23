package com.curso.v4;

public class Principal {

	public static void main(String[] args) {

		int x = 5;
		int y = -1;
		int res = 0;
		
		try {
			res = calcularDiv(x,y);
		} catch (CeroException e) {
			e.printStackTrace();
		} catch (NegativoException e) {
			e.printStackTrace();
		}
		
		System.out.println(res);
		System.out.println("Fin exitoso");
	}
	
	
	

	private static int calcularDiv(int x, int y) throws CeroException,NegativoException {
		if (y==0)
			throw new CeroException("No se puede dividir entre 0");
		if (y<0)
			throw new NegativoException("No se puede dividir entre valores negativos");
		return x/y;
	}

}
