package com.curso.v5;

public class Principal {

	public static void main(String[] args) {

		Component component = new CompositeSuma(
				new CompositeResta(new ConstanteLeaf(3.0),
						new CompositeDiv(new ConstanteLeaf(8.0),
								         new ConstanteLeaf(2.0))
						),
				new CompositeMulti(new ConstanteLeaf(4.0),
						           new ConstanteLeaf(5.0))
				);

		System.out.println(component.getValor()); //19

	}

}
