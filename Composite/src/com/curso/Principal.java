package com.curso;

public class Principal {

	public static void main(String[] args) {

		ConstanteLeaf c1 = new ConstanteLeaf(5.0);
		ConstanteLeaf c2 = new ConstanteLeaf(8.0);
		
		double valor1 = c1.getValor();
		double valor2 = c2.getValor();
		
		System.out.println(valor1);
		System.out.println(valor2);
		
		CompositeSuma comSuma = new CompositeSuma(c1,c2);
		double res = comSuma.getValor();
		
		System.out.println(res);
		
		CompositeResta comResta = new CompositeResta(c1,c2);
		res = comResta.getValor();
		
		System.out.println(res);


	}

}
