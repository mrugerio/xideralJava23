package com.curso.v3;

public class Principal {

	public static void main(String[] args) {

		Component c1 = new ConstanteLeaf(2.0);
		Component c2 = new ConstanteLeaf(3.0);
		Component c3 = new ConstanteLeaf(4.0);
		Component c4 = new ConstanteLeaf(5.0);
		Component c5 = new ConstanteLeaf(8.0);
		
		Component component = new CompositeSuma(
				new CompositeResta(c2,
						new CompositeDiv(c5,c1)
						),
				new CompositeMulti(c3,c4)
				);

		System.out.println(component.getValor()); //19

	}

}
