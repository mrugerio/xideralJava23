package com.with.observer.v1;

public abstract class Observer {
	
	Subject sb;
	
	Observer(Subject sb){
		this.sb = sb;
		//sb de la instancia de clase
		//sb del parametro
		//ambas apuntan al mismo objeto
		sb.attach(this);
	}
	
	abstract void update();
}
