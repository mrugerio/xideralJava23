package com.curso;

import static java.util.Arrays.sort;

public class Principal {

	public static void main(String[] args) {
		String[] strings = { "10", "ab", "a", "A" };
		sort(strings);
		for (String string : strings)
			System.out.print(string + " ");
			//10 A a  
	}

}
