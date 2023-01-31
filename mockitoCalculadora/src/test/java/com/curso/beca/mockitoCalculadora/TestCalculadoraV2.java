package com.curso.beca.mockitoCalculadora;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestCalculadoraV2 {
	
	@InjectMocks
	Calculadora calculadora;
	
	@Mock
	CloudCalculadora cloudGoogle;
	
	@Before
	public void init() {
		when(cloudGoogle.sumaExterna(5.0,5.0)).thenReturn(10.0);
	}
	
	@Test
	public void testSuma() {
		double resSuma = 10.0;
		assertEquals(resSuma,calculadora.suma(5.0,5.0),0.1);
	}
	
	@Test
	public void testSumaCloud() {				
		double resSuma = 10.0;
		assertEquals(resSuma,calculadora.sumaCloud(5.0,5.0),0.1);
	}
	
}
