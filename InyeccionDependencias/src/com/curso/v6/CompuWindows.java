package com.curso.v6;

public class CompuWindows implements Computadora{
	
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
