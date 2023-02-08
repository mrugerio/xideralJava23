package com.with.observer.v0;

public class Principal {

	public static void main(String[] args) {
		
		Observer o1 = new Text("Hello");
		Observer o2 = new Image("Duck");
		Observer o3 = new ScrollBar();
		Observer o4 = new Gif("Java");
		
		Mouse mouse = new Mouse();
		
		mouse.attach(o1);
		mouse.click();
		
		System.out.println("----------");
		
		mouse.attach(o2);
		mouse.click();
		
		System.out.println("----------");
		
		mouse.attach(o3);
		mouse.click();
		
		System.out.println("----------");
		
		mouse.detach(o1);
		mouse.attach(o4);
		mouse.click();
		
		System.out.println("----------");

		
		
	}

}
