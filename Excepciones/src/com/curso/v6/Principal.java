package com.curso.v6;

public class Principal {

	public static void main(String[] args) {

		int x = 101;
		int y = 2;
		int res = 0;

		try {
			res = calcularDiv(x, y);
		} catch (CeroException e) {
			e.printStackTrace();
		} catch (NegativoException e) {
			e.printStackTrace();
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}

		System.out.println(res);
		System.out.println("Fin exitoso");
	}

	private static int calcularDiv(int x, int y) throws CeroException, NegativoException {
		if (y == 0)
			throw new CeroException("No se puede dividir entre 0");
		if (y < 0)
			throw new NegativoException("No se puede dividir entre valores negativos");
		if (x > 100)
			throw new UnsupportedOperationException("x no puede ser mayor a 100");
		return x / y;
	}

}
