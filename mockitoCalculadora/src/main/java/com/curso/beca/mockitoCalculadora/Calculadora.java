package com.curso.beca.mockitoCalculadora;

public class Calculadora {
	
	//INYECTAR
	//DELEGACION
	CloudCalculadora cloudCalc;
	
	double suma(double a,double b) {
		double resultadoSuma = cloudCalc.sumaExterna(a,b);
		return resultadoSuma;
	}

}
