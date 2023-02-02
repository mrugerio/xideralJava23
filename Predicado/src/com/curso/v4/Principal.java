package com.curso.v4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Principal {
	
	private static Employee[] arrayOfEmps = { 
			new Employee(0, "Patrobas", 100.0), 
			new Employee(1, "Tercio", 200.0),
			new Employee(2, "Andronico", 300.0), 
			new Employee(3, "Epeneto", 400.0),
			new Employee(4, "Filologo", 500.0) };

	public static void main(String[] args) {

		List<Employee> listEmpledos = Arrays.asList(arrayOfEmps);
		
		showEmployee(listEmpledos,e -> e.getSalary()>250);
		showEmployee(listEmpledos,e -> e.getNombre().length() > 6);
		showEmployee(listEmpledos,e -> e.getNombre().length() > 7 && e.getSalary()>250);
		
		List<String> listaNombres = Arrays.asList("Patrobas","Tercio","Andronico");
		
		showNombre(listaNombres, n -> n.length() > 6);
		
	}
	
	static void showNombre(List<String> lista, Predicate<String> p ) {
		for(String nombre:lista) {
			if(p.test(nombre)) {
				System.out.println(nombre);
			}
		}
		System.out.println("-------------");
	}
	
	static void showEmployee(List<Employee> lista, Predicate<Employee> p ) {
		for(Employee emp:lista) {
			if(p.test(emp)) {
				System.out.println(emp);
			}
		}
		System.out.println("-------------");
	}
	
	
	
	

}
