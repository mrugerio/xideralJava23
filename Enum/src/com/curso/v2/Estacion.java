package com.curso.v2;

public enum Estacion {
	
	INVIERNO("Baja"),
	PRIMAVERA("Media"),
	VERANO("Alta"),
	OTOÑO("Nula");
	
	private String visitantesEsperados;
	
	Estacion(String visitantesEsperados){
		this.visitantesEsperados = visitantesEsperados;
	}
	
	public String mostrarVisEsperados() {
		return visitantesEsperados;
	}

}
