package com.curso.beca.mockitoCalculadora;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestCalculadoraV3 {
	
	@InjectMocks
	Calculadora calculadora;
	
	@Mock
	CloudCalculadora cloudGoogle;
	
	@Test
	public void testSumaCloud() {
		when(cloudGoogle.sumaExterna(6.0,8.0)).thenReturn(14.0);
		double resultado = 28.0;
		assertEquals(resultado,calculadora.suma(6.0,8.0),0.1);
	}
	
}
