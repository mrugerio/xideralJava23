package com.curso.V1;

public class Principal {

	public static void main(String[] args) {

		Ave ave = new AguilaReal();
		
		ave = new AguilaCalva();
		
		//ave = getAve();
		
		if (ave instanceof AguilaCalva)
			((AguilaCalva)ave).comerAguilaCalva();
		
		if (ave instanceof AguilaReal)
			((AguilaReal)ave).comerAguilaReal();
		
	}

}
