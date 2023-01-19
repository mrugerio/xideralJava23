package com.curso.v6;

public class CompuLinux implements Computadora {
	
	//HAS-A
	String version;

	public CompuLinux(String version) {
		this.version = version;
	}

	public void prender() {
		System.out.println("Linux version: "+version+ ", inicio");
	}

}
