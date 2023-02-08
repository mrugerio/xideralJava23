package com.with.observer.v1;

public class Principal {

	public static void main(String[] args) {
		
		Mouse mouse = new Mouse();
		
		Observer o1 = new Text("Hello",mouse);
		
		mouse.click();
		System.out.println("---------");
		
		Observer o2 = new Image("Duck",mouse);
		Observer o3 = new ScrollBar(mouse);
		
		mouse.click();
		System.out.println("---------");
		
		Observer o4 = new Gif("Java",mouse);
		
		mouse.click();
		System.out.println("---------");
	
		
	}

}
