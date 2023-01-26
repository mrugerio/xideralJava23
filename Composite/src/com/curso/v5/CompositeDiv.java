package com.curso.v5;

public class CompositeDiv extends ComponenteAbst {

	public CompositeDiv(Component cRight, Component cLeft) {
		super(cRight, cLeft);
	}

	@Override
	public double getValor() {
		double res = componentRight.getValor() /
				componentLeft.getValor();
		return res;
	}

}