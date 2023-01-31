package com.curso.v2;

public class Suma {
	
	//INYECTAR EL SERVICIO
	//DELEGAR LA FUNCIONALIDAD
	CloudSuma cloudSuma;
	
	int x;
	int y;
	
	public Suma(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	int ejecuta() {
		//LA OPERACION LA DELEGAMOS A UN SERVICIO
		return cloudSuma.ejecutarSumaCloud(x, y);
	}
}
