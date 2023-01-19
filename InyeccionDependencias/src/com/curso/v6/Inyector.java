package com.curso.v6;

//PROPORCIONADO POR LOS FRAMEWORKS COMO Spring o Angular
public class Inyector {
	
	static Computadora cw = new CompuWindows("Vista");
	static Computadora cl = new CompuLinux("Ubuntu 18");
	
	static void inyectarPc(Becario bec,String tipoPc) {
		if (tipoPc == "Windows")
			bec.setComputadora(cw);
		else
			bec.setComputadora(cl);
	}
	

}
