package com.curso;

public class Principal2 {
	
	int contador = 5;
	
	{
		System.out.println("Bloque 01");
		contador++;
	}
	
	static {
		System.out.println("Bloque static 01");
	}
	
	
	
	Principal2(){
		System.out.println("Paso por constructor");
		contador++;
		
	}

	public static void main(String[] args) {
		System.out.println("Hola mundo");
		Principal2 p = new Principal2();
		System.out.println(p.contador);
		Principal2 op = new Principal2();
		System.out.println(op.contador);
		Principal2 opp = new Principal2();
		System.out.println(opp.contador);
		
		
//		int x = 1;
//		int y = 010; //8 //OCTAL
//		System.out.println("Resultado");
//		System.out.println(x+y);

	}
	
	
	{
		System.out.println("Bloque 02");
		contador++;
	}

	static {
		System.out.println("Bloque static 02");
		System.out.println("-----------------");
	}
}
