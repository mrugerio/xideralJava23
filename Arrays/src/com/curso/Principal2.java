package com.curso;

import java.util.Arrays;

public class Principal2 {

	public static void main(String[] args) {
		int[] numbers = {4,6,8,2,3,1};
		Arrays.sort(numbers);
		System.out.println(Arrays.binarySearch(numbers, 2));
		System.out.println("----------");
		int[] numbers2 = {2,6,8,10};
		System.out.println(Arrays.binarySearch(numbers2, 20));
	}

}
