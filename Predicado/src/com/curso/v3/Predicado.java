package com.curso.v3;

@FunctionalInterface
interface Predicado<T> {
	
	boolean probar(T t);
	
}
