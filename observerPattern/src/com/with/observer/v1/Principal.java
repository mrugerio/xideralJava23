package com.with.observer.v1;

public class Principal {

	public static void main(String[] args) {
		
		Mouse mouse = new Mouse();
		
		//mouse.click();
		//System.out.println("---------");

		new Text("Hello",mouse);
		
		System.out.println(mouse == mouse.listaObservers.get(0).sb);
		
		mouse.click();
		System.out.println("---------");
		
		new Image("Duck",mouse);
		ScrollBar scroll = new ScrollBar(mouse);

		System.out.println(mouse == mouse.listaObservers.get(1).sb);
		System.out.println(mouse == mouse.listaObservers.get(2).sb);

		mouse.click();
		System.out.println("---------");
		
		new Gif("Java",mouse);
		System.out.println(mouse == mouse.listaObservers.get(3).sb);
		
		
		//DETACH IMAGE
		
		mouse.detach(mouse.listaObservers.get(1));
		mouse.click();
		System.out.println("-----****----");
		
		mouse = null;
		
		((Mouse)(scroll.sb)).click();
		
	}

}
