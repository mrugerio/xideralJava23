package com.curso.v0;
import java.util.*;

public class Principal {

	public static void main(String[] args) {

		String[] letrasNumeros = {"Uno","Dos","Tres","Cuatro","Cinco","Seis"};
		//Arrays.sort(letrasNumeros);
		System.out.println(Arrays.toString(letrasNumeros));
		
		int[] numeros = {45,78,12,7,29};
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		System.out.println("--------------");
		
		List<String> listaLetrasNum = new ArrayList<>();
		listaLetrasNum.add("Uno");
		listaLetrasNum.add("Dos");
		listaLetrasNum.add("Tres");
		listaLetrasNum.add("Cuatro");
		listaLetrasNum.add("Cinco");
		
		Collections.sort(listaLetrasNum);
		System.out.println(listaLetrasNum);
		
		System.out.println("--------------");

		List<String> listaLetrasNum2 = 
				Arrays.asList(letrasNumeros);
		Collections.sort(listaLetrasNum2);

		System.out.println(listaLetrasNum2);
		
		
		
	}

}
