package com.curso;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		// NO SE PUEDE USAR GENERICS CON PRIMITIVOS
		// List<int> liPrimitiva;

		List<Integer> li = new ArrayList<>();
		for (int i = 1; i < 50; i += 2)
			li.add(i);
	}

	public static int sumEven(List<Integer> li) {
		int sum = 0;
		for (int i : li)
			if (i % 2 == 0)
				sum += i;
		return sum;
	}

}
