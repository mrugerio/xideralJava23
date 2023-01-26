package com.curso.v5;

public class CompositeResta extends ComponenteAbst {

	public CompositeResta(Component cRight, Component cLeft) {
		super(cRight, cLeft);
	}

	@Override
	public double getValor() {
		double res = componentRight.getValor() -
				componentLeft.getValor();
		return res;
	}

}
