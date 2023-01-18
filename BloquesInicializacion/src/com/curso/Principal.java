package com.curso;

public class Principal {
	
	int contador = 5;
	
	{
		System.out.println("Bloque 01");
		contador++;
	}
	
	{
		System.out.println("Bloque 03");
		contador++;
	}
	
	
	
	Principal(){
		System.out.println("Paso por constructor");
		contador++;
		
	}

	public static void main(String[] args) {
		System.out.println("Hola mundo");
		Principal p = new Principal();
		System.out.println(p.contador);
		Principal op = new Principal();
		System.out.println(p.contador);

	}
	
	
	{
		System.out.println("Bloque 02");
		contador++;
	}

}
