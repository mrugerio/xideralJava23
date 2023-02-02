package com.curso.v2;

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
		
		showEmployee(listEmpledos,e -> e.getSalary()>250);
		showEmployee(listEmpledos,e -> e.getNombre().length() > 6);
		showEmployee(listEmpledos,e -> e.getNombre().length() > 7 && e.getSalary()>250);
		
		
	}
	
	static void showEmployee(List<Employee> lista, Predicado p ) {
		for(Employee emp:lista) {
			if(p.probar(emp)) {
				System.out.println(emp);
			}
		}
		System.out.println("-------------");
	}
	

}
