package com.curso;

public class ArrayMulti {

	public static void main(String[] args) {
		
//		int[] listU = {1,4,5,7};
//		
//		for (int i: listU) {
//			
//		}
//
//		
//		int[][] listB = { { 1, 13,78 }, { 5, 2,12,56 }, { 12, 62 } };
//		
//		for ( int[] array :listB) {
//			
//		}
		
		int suma = 0;
		int[][][] listT = { { { 1, 13, 7 }, { 5, 2 }, { 2, 2, 7 } },
				{ { 2, 45 }, { 5, 2 }, { 12, 82, 78 } }};
		
		for ( int[][] arrayBi :listT) {
			for (int[] arrayUni :arrayBi) {
				for (int i:arrayUni ) {
					suma += i;
				}
			}
		}

		System.out.println(suma);
		

	}

}
