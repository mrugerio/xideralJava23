package com.curso.v5;
                           //IS-A (HERENCIA)
public class CompositeMulti extends ComponenteAbst {

	public CompositeMulti(Component cRight, Component cLeft) {
		super(cRight, cLeft);
	}

	@Override
	public double getValor() {
		double res = componentRight.getValor() *
				componentLeft.getValor();
		return res;
	}

}