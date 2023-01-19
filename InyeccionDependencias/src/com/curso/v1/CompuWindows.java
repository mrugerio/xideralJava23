package com.curso.v1;

public class CompuWindows {
	
	//HAS-A
	String version;

	public CompuWindows(String version) {
		this.version = version;
	}

	public void prender() {
		System.out.println("Windows version: "+version+ ", inicio");
	}

	
	
}
