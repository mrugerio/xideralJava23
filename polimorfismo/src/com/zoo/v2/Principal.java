package com.zoo.v2;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		/*
		Gato gato = new Gato();
		gato.makeSound();
		
		Perro perro = new Perro();
		perro.makeSound();*/
		
		Animal animal = new Gato();
		animal.makeSound();
		
		animal = new Perro();
		animal.makeSound();
		
		animal = new Pato();
		animal.makeSound();

		System.out.println("----Interfaces-----");
		
		Animal animal2 = getAnimal();
		
		animal2.makeSound();

	}

	private static Animal getAnimal() {
		
		List<Animal> listaAnimal = Arrays.asList(
				new Gato(),
				new Perro(),
				//new Animal(),
				new Pato());
		//System.out.println(listaAnimal.size()); //3
		int random = (int) (Math.random() * listaAnimal.size());
		//System.out.println(random);
		return listaAnimal.get(random);
	}

}

//public -> protected -> *default -> private

interface Animal {
	void makeSound();
}

class Gato implements Animal {
	@Override
	public void makeSound() {
		System.out.println("Miauuuu");
	}
}

class Perro implements Animal{
	@Override
	public void makeSound() {
		System.out.println("Guauaaau");
	}
}
class Pato implements Animal{
	@Override
	public void makeSound() {
		System.out.println("Quak quak");
	}
}

