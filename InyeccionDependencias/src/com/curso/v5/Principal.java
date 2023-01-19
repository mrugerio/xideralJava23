package com.curso.v5;

public class Principal {

	public static void main(String[] args) {

		Becario becario1 = Inyector.inyectarPc("Patrobas", "Windows");
		becario1.encenderCompu();
		
		Becario becario2 =Inyector.inyectarPc("Epeneto", "Linux");
		becario2.encenderCompu();
		
		Becario becario3 =Inyector.inyectarPc("Tercio", "Windows");
		becario3.encenderCompu();
		
	}

}
