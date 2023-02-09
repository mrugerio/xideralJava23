package com.java.academy.functional.exercises.optional;

import java.util.Optional;

import com.java.academy.functional.exercises.repo.Address;
import com.java.academy.functional.exercises.repo.Person;
import com.java.academy.functional.exercises.repo.PersonRepository;

public class OptionalMapExample {

	public static void main(String[] args) {
		//optionalMapExample();
		//optionalFlatMapExample();
		optionalMapFilterExample();
	}
	
	static void optionalMapExample() {
		Optional<Person> per = PersonRepository.getPersonOptional();
		per.ifPresent(person -> {
			String name = per.map(Person :: getName).orElse("No Data Found");
			System.out.println("Name :"+name);
		} );
	}
	
	static void optionalFlatMapExample() {
		Optional<Person> per = PersonRepository.getPersonOptional();
		if(per.isPresent()) {
			Optional<Address> add = per.flatMap(Person :: getAddress);
			System.out.println("Address :"+add.get());
		}
	}
	
	static void optionalMapFilterExample() {
		Optional<Person> per = PersonRepository.getPersonOptional().filter(person -> person.getHeight() >=140);
		per.ifPresent(person -> System.out.println(person.getAddress().get()));
	}

}
