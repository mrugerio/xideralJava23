package com.curso.v2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestComposite {

	@Test
	void testDouble() {
		double d = 5.0;
		assertEquals(d,5.0);
	}

	@Test
	void testDoubleSuma() {
		double d1 = 5.0;
		double d2 = 3.0;
		assertEquals(d1+d2,8.0);
	}
	
	@Test
	void testConstante1() {
		double d = 9.0;
		Expresion e = new Constante(d);
		assertEquals(d,e.getValor());
	}
	
	@Test
	void testConstante2() {
		Expresion e = new Constante(9.5);
		assertEquals(9.5,e.getValor());
	}
	
	@Test
	void testSuma() {
		double d1 = 4.5;
		double d2 = 5.8;
		
		Expresion left = new Constante(d1);
		Expresion right = new Constante(d2);
		
		Expresion suma = new Suma(left,right);
		
		assertEquals(d1+d2,10.3);
		assertEquals(d1+d2,suma.getValor());
	}
	
	@Test
	void testResta() {
		double d1 = 4.5;
		double d2 = 5.8;
		
		Expresion left = new Constante(d1);
		Expresion right = new Constante(d2);
		
		Expresion resta = new Resta(left,right);
		
		assertEquals(d1-d2,resta.getValor());
	}
	
	@Test
	void testMulti() {
		double d1 = 4.5;
		double d2 = 5.8;
		
		Expresion left = new Constante(d1);
		Expresion right = new Constante(d2);
		
		Expresion multi = new Multi(left,right);
		
		assertEquals(d1*d2,multi.getValor());
	}
	
	@Test
	void testDiv() {
		double d1 = 4.5;
		double d2 = 5.8;
		
		Expresion left = new Constante(d1);
		Expresion right = new Constante(d2);
		
		Expresion div = new Division(left,right);
		
		assertEquals(d1/d2,div.getValor());
	}
	
	@Test
	void testOperacionCompleja() {
		double d1 = 4;
		double d2 = 6;
		double d3 = 200;
		double d4 = 3;
		double d5 = 83;
		
		Expresion e = new Division(
				new Multi(
						new Resta(
							new Constante(d1),
							new Constante(d2)
						),
						new Constante(d3)
				),
				new Suma(
						new Constante(d4),
						new Constante(d5)
				)		
		);
		
		assertEquals(-4.651162,e.getValor(),0.0001);
	}
	
}
