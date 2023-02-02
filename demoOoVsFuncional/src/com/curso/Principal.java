package com.curso;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {
	
	private static Employee[] arrayOfEmps = { 
			new Employee(0, "Patrobas", 100.0), 
			new Employee(1, "Tercio", 200.0),
			new Employee(2, "Andronico", 300.0), 
			new Employee(3, "Epeneto", 400.0),
			new Employee(4, "Filologo", 500.0) };

	public static void main(String[] args) {

		List<Employee> listEmpledos = Arrays.asList(arrayOfEmps);
		
		//Filtrar: Salario menor a 400
		//Aumentar salario en 200
		//Filtrar: Longitud del nombre sea mayor a 6
		//Ordenar por nombre
		//Lista de nombres
		
		//QUE QUIERO
		List<String> nombres =
				listEmpledos.stream().parallel()
				.filter(x -> x.getSalary()<400)
				//.peek(System.out::println)
				.peek(z -> z.incrementoSalario(200))
				//.peek(System.out::println)
				.filter(e -> e.getNombre().length()>6)
				//.peek(System.out::println)
				.sorted(Comparator.comparing(Employee::getNombre))
				//.peek(System.out::println)
				.map(y -> y.getNombre())
				//.peek(System.out::println)
				.collect(Collectors.toList());
		
		System.out.println(nombres);
				
		
	}

}
