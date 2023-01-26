package com.curso.v5;

public abstract class ComponenteAbst implements Component {

	// HAS-A (COMPOSICION)
	Component componentRight;
	Component componentLeft;

	public ComponenteAbst(Component componentRight, Component componentLeft) {
			this.componentRight = componentRight;
			this.componentLeft = componentLeft;
		}

}
