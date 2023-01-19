package com.curso.v3;

//PROPORCIONADO POR LOS FRAMEWORKS COMO Spring o Angular
public class Inyector {
	
	static Computadora cw = new CompuWindows("Vista");
	static Computadora cl = new CompuLinux("Ubuntu 18");
	
	static void inyectarPc(Becario bec,String tipoPc) {
		if (tipoPc == "Windows")
			bec.computadora = cw;
		else
			bec.computadora = cl;
	}
	

}
