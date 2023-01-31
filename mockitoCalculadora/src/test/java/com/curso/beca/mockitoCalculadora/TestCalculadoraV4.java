package com.curso.beca.mockitoCalculadora;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestCalculadoraV4 {
	
	@InjectMocks
	Calculadora calculadora;
	
	@Mock
	CloudCalculadora cloudGoogle;
	
	@Test
	public void testSumaCloud() {
		when(cloudGoogle.sumaExterna(6.0,14.0)).thenReturn(20.0);
		double resultado = 40;
		assertEquals(resultado,calculadora.suma(2.0,9.0),0.1);
	}
	
}
