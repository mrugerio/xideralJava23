package com.curso.v5;

//PROPORCIONADO POR LOS FRAMEWORKS COMO Spring o Angular
public class Inyector {

	static Becario inyectarPc(String nomBecario,String tipoPc) {
		if (tipoPc == "Windows")
			return new Becario(nomBecario,new CompuWindows("Vista"));
		if (tipoPc =="Mac")
			return new Becario(nomBecario,new CompuMac("Sierra"));
		else
			return new Becario(nomBecario,new CompuLinux("Ubuntu 18"));
	}

}
