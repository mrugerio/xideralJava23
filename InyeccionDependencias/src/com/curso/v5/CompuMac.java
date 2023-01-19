package com.curso.v5;

public class CompuMac extends Computadora {

	// HAS-A
	String version;

	public CompuMac(String version) {
			this.version = version;
		}

	public void prender() {
		System.out.println("Mac version: " + version + ", inicio");
	}
}
