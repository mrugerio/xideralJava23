package com.with.observer.v1;

public abstract class Observer {
	
	Subject sb;
	
	Observer(Subject sb){
		this.sb = sb;
		sb.attach(this);
	}
	
	abstract void update();
}
