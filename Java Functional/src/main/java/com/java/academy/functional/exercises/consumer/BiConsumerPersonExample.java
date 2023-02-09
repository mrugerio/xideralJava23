package com.java.academy.functional.exercises.consumer;

import java.util.List;
import java.util.function.BiConsumer;

import com.java.academy.functional.exercises.repo.Person;
import com.java.academy.functional.exercises.repo.PersonRepository;

public class BiConsumerPersonExample {
	
	static void printPersonDetails() {
		BiConsumer<String, List<String>> personConsumer = (name,hobbies) -> System.out.println(name +" "+hobbies);
		BiConsumer<String, Double> salaryConsumer = (name,salary) -> System.out.println(name +" "+salary);
		
		List<Person> personList = PersonRepository.getAllPersons();
		
		//personList.forEach(per -> personConsumer.accept(per.getName(), per.getHobbies()));
		personList.forEach(per -> {
			personConsumer.accept(per.getName(), per.getHobbies());
			salaryConsumer.accept(per.getName(),per.getSalary());
		});
	}

	public static void main(String[] args) {
		printPersonDetails();
	}

}
