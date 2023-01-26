package com.curso.v2;
                           //IS-A (HERENCIA)
public class CompositeMulti implements Component {
	
	//HAS-A (COMPOSICION)
	private Component componentRight;
	private Component componentLeft;

	public CompositeMulti(Component componentRight, Component componentLeft) {
		this.componentRight = componentRight;
		this.componentLeft = componentLeft;
	}

	@Override
	public double getValor() {
		double res = componentRight.getValor() *
				componentLeft.getValor();
		return res;
	}

}
