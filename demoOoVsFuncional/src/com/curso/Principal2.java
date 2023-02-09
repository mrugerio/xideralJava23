package com.curso;

import static java.util.Arrays.asList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal2 {

	private static Employee[] arrayOfEmps = { 
			new Employee(0, "Patrobas", 100.0), 
			new Employee(1, "Tercio", 200.0),
			new Employee(2, "Zx", 300.0), 
			new Employee(3, "Epeneto", 400.0), 
			new Employee(4, "Filologox", 500.0),
			new Employee(5, "Patrobas", 100.0), 
			new Employee(6, "Tercio", 800.0), 
			new Employee(7, "Andronicox", 300.0),
			new Employee(8, "Epenetox", 400.0), 
			new Employee(9, "Filologox", 500.0) };

	
	public static Employee getEmpleado(int id) {
		return arrayOfEmps[id];
	}
	
	public static void main(String... argumentos) {

		List<Employee> empList = asList(arrayOfEmps);

//		Consumer<Employee> ce = emp -> System.out.println(x);
//		Stream<Employee> se = empList.stream();
//		se.forEach(ce);

		empList.stream().forEach(x -> System.out.println(x));

		// -------------
		System.out.println("*******");
		// TRANSFORMA UN ARREGLO DE ENTEROS
		// EN UNA LISTA DE EMPLEADOS
		Integer[] empIds = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		Stream<Integer> streamInt = Stream.of(empIds);

//		List<Employee> listEmp = streamInt
//					.map(entero -> Principal2.getEmpleado(entero))
//					.collect(Collectors.toList());

		List<Employee> listEmp = streamInt
					.map(entero -> {
						Employee emp = arrayOfEmps[entero];
						emp.setSalary(emp.getSalary()+100);
						return emp;
					})
					.collect(Collectors.toList());
		
		listEmp.forEach(System.out::println);
		
		System.out.println("*******");
		
		//Employee patrobas = new Employee(0, "Patrobas", 100.0);
		
		Supplier<Employee> sup = Employee::new;
		Employee patrobas = sup.get();
		
		Function<String,Employee> fun = Employee::new;
		Employee epeneto = fun.apply("Epeneto");
		
		BiFunction<Integer,String,Employee> bifun = Employee::new;
		Employee mary = bifun.apply(100, "Mary");
		
		//System.out.println(mary);
		
		listEmp = Stream.of(empIds)
				.map(Principal2::getEmpleado)
				.filter(e -> e.getNombre().endsWith("o"))
				.filter(e -> e.getSalary() > 350.0)
				.collect(Collectors.toList());
		
		listEmp.forEach(System.out::println);
		
		System.out.println("*******");

		Stream.of(empIds)
		.map(Principal2::getEmpleado)
		.filter(e -> e.getNombre().endsWith("o"))
		.filter(e -> e.getSalary() > 350.0)
		.forEach(System.out::println);
		

	}

}
