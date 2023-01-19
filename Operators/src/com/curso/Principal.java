package com.curso;

public class Principal {

	public static void main(String[] args) {

		int cookies = 4;
		double reward = 3 + 2 * cookies--;
		                           
		System.out.println(reward); //11
		System.out.println(cookies); //3
		
		reward = 3 + 2 * cookies++;
		System.out.println(reward); //9
		System.out.println(cookies); //4

		int lion = 3;
		int tiger = ++lion * 5 / lion--; 
		//            3     *  5  /    3
		
		System.out.println("lion is " + lion); //3
		System.out.println("tiger is " + tiger); //5
		
		System.out.println("---------");
		
		boolean healthy = false;
		if(healthy = true)
			System.out.println("Good!");
		
		int  i = 5;
		if((i+=1)>10)
			System.out.println("Good2!");

	}

}
