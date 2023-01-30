package com.curso.v1;

public class Suma {
	
	//INYECTAR EL SERVICIO
	CloudSuma cloudSuma;
	
	int x;
	int y;
	
	public Suma(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	int ejecuta() {
		return cloudSuma.ejecutarSumaCloud(x, y);
	}
}
