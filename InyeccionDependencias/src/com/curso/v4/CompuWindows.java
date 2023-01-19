package com.curso.v4;

public class CompuWindows extends Computadora {
	
	//HAS-A
	String version;

	public CompuWindows(String version) {
		this.version = version;
	}

	@Override
	public void prender() {
		System.out.println("Windows version: "+version+ ", inicio");
	}

}
