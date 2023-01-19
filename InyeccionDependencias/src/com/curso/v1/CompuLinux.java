package com.curso.v1;

public class CompuLinux {
	
	//HAS-A
	String version;

	public CompuLinux(String version) {
		this.version = version;
	}

	public void prender() {
		System.out.println("Linux version: "+version+ ", inicio");
	}

	
	
}
