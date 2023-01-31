package com.curso.v2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSuma {

	@Test
	void test() {
		int x = 4;
		int y = 5;
		Suma s = new Suma(x,y);
		
		//MALA PRACTICA
		CloudSuma cs = new CloudSuma() {
			@Override
			public int ejecutarSumaCloud(int x, int y) {
				// TODO LO QUE HAYA QUE HACER
				// PUEDE RESULTAR MUY COMPLEJO
				return x+y;
			}
		};
		
		s.cloudSuma = cs;
		
		assertEquals(x+y,s.ejecuta());
	}

}
