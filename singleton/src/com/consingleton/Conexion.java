package com.consingleton;

public class Conexion {
	
	//HAS-A (COMPOSICION)
	static private Conexion conexion;
	
	private String nombre;
	static int contador;
	
	private Conexion(String nombre) {
		//CONECTA A DB
		contador++;
	}
	
	static public Conexion getInstace() {
		if (conexion==null) 
			conexion = new Conexion("Mysql");
		return conexion;
	}

}
