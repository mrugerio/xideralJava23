package com.curso.beca.mockitoCalculadora;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

public class TestCalculadora {
	

	@Test
	public void testSuma() {
		Calculadora calculadora = new Calculadora();
		double resSuma = 10.0;
		assertEquals(resSuma,calculadora.suma(5.0,5.0),0.1);
	}
	
	@Test
	public void testSumaCloud() {
		Calculadora calculadora = new Calculadora();
		
		//MALA PRACTICA
		//RESPONSABILIDAD ES DEL SERVICIO EXTERNO
		CloudCalculadora cc = new CloudCalculadora() {
			@Override
			public double sumaExterna(double a, double b) {
				return a+b;
			}
		};
		
		calculadora.cloudCalc = cc;
		
		double resSuma = 10.0;
		assertEquals(resSuma,calculadora.sumaCloud(5.0,5.0),0.1);
	}
	
	
	
}
