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
		when(cloudGoogle.sumaExterna(6.0,8.0)).thenReturn(14.0);
	}
	
	@Test
	public void testSumaCloud() {				
		double resSuma = 14.0;
		assertEquals(resSuma,calculadora.suma(6.0,8.0),0.1);
	}
	
}
