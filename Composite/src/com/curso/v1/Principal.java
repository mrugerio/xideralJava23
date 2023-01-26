package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		Component c1 = new ConstanteLeaf(5.0);
		Component c2 = new ConstanteLeaf(8.0);
		Component c3 = new ConstanteLeaf(3.0);
		Component c4 = new ConstanteLeaf(9.0);
		
		Component comSuma1 = new CompositeSuma(c1,c2);
		Component comSuma2 = new CompositeSuma(c3,c4);
		
		Component comResta = new CompositeResta(comSuma1,comSuma2);
		double res = comResta.getValor();
		
		System.out.println(res);


	}

}
