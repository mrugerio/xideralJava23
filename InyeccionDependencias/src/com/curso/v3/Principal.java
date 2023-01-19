package com.curso.v3;

public class Principal {

	public static void main(String[] args) {

		Becario becario1 = new Becario("Patrobas");
		Inyector.inyectarPc(becario1, "Windows");
		becario1.encenderCompu();
		
		Becario becario2 = new Becario("Epeneto");
		Inyector.inyectarPc(becario2, "Linux");
		becario2.encenderCompu();
		
	}

}
