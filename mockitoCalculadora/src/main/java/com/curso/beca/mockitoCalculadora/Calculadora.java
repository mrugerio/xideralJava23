package com.curso.beca.mockitoCalculadora;

public class Calculadora {
	
	//INYECTAR
	//DELEGACION
	CloudCalculadora cloudCalc;
	
	double suma(double a,double b) {
		a += 4;
		b += 5;
		double resultadoSuma = cloudCalc.sumaExterna(a,b);
		return resultadoSuma * 2;
	}

}
