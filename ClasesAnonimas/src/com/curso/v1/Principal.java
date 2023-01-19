package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		//CLASES ANONIMAS
		Operacion o1 = new Operacion(){
			@Override
			public int ejecuta(int x, int y) {
				return x+y;
			}
		};
		int res = o1.ejecuta(8, 4);
		System.out.println(res);

		Operacion o2 = new Operacion(){
			@Override
			public int ejecuta(int x, int y) {
				return x-y;
			}
		};
		res = o2.ejecuta(8, 4);
		System.out.println(res);
		
		Operacion o3 = new Operacion(){
			@Override
			public int ejecuta(int x, int y) {
				return (int)Math.pow(x, y);
			}
		};
		res = o3.ejecuta(8, 4);
		System.out.println(res);
		
		Operacion o4 = new Operacion(){
			
			@Override
			public int ejecuta(int x, int y) {
				return x*y;
			}
			@Override
			public String toString() {
				return "Multi:";
			}
		};
		System.out.println(o4);
		res = o4.ejecuta(8, 4);
		System.out.println(res);

	}

}
