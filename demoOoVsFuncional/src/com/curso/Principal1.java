package com.curso;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Principal1 {

	private static Employee[] arrayOfEmps = { 
			new Employee(0, "Patrobas", 100.0), 
			new Employee(1, "Tercio", 200.0),
			new Employee(2, "Andronico", 300.0), 
			new Employee(3, "Epeneto", 400.0),
			new Employee(4, "Filologo", 500.0) };

	public static void main(String[] args) {
		
		//*** INICIO DEMOS DE COMO CONSTRUIR STREAMS ***
		Stream<Employee> streamEmp1 = Stream.of(arrayOfEmps);
		
		List<Employee> listEmpledos = Arrays.asList(arrayOfEmps);
		
		Stream<Employee> streamEmp2 = listEmpledos.stream();
		
		Stream<Employee> streamEmp3 = Stream.of(
								new Employee(2, "Andronico", 300.0),
								new Employee(4, "Filologo", 500.0),
								new Employee(0, "Patrobas", 100.0));

	}

}
