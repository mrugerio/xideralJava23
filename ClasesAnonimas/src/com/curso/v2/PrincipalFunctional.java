package com.curso.v2;

public class PrincipalFunctional {

	public static void main(String[] args) {

		//LAMBDAS
		Operacion o1 = (z,w) -> z+w;
		int res = o1.ejecuta(12, 4);
		System.out.println(res);

		Operacion o2 = (x,y) -> x-y;
		res = o2.ejecuta(12, 4);
		System.out.println(res);
		
		Operacion o3 = (x,y) -> (int)Math.pow(x, y);
		res = o3.ejecuta(12, 4);
		System.out.println(res);
		
		Operacion o4 = (i1,i2) -> i1*i2;
		res = o4.ejecuta(12, 4);
		System.out.println(res);

	}

}
