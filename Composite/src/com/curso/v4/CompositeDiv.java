package com.curso.v4;
                           //IS-A (HERENCIA)
public class CompositeDiv implements Component {
	
	//HAS-A (COMPOSICION)
	private Component componentRight;
	private Component componentLeft;

	public CompositeDiv(Component componentRight, Component componentLeft) {
		this.componentRight = componentRight;
		this.componentLeft = componentLeft;
	}

	@Override
	public double getValor() {
		double res = componentRight.getValor() /
				componentLeft.getValor();
		return res;
	}

}
