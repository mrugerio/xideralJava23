package com.curso;
import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("koala", "Bamboo");
		map.put("pato", "Donald");
		map.put("gato", "Benito");
		map.put("pato", "Lucas");
		map.put("ave", "Bamboo");
		
		for (String key : map.keySet())
			System.out.println(key + " " + map.get(key));
		
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(0, "Bamboo");
		map1.put(1, "Donald");
		map1.put(2, "Benito");
		map1.put(0, "Lucas");
		map1.put(4, "Bamboo");
		
		for (int key : map1.keySet())
			System.out.println(key + " " + map1.get(key));
		
		System.out.println("-------------");
		
		Estudiante e1 =new Estudiante("Juan", 18, 8.5);
		Estudiante e2 =new Estudiante("Maria", 20, 9.1);
		Estudiante e3 =new Estudiante("Pedro", 22, 7.8);
		Estudiante e4 =new Estudiante("Ana", 19, 9.2);
		Estudiante e5 =new Estudiante("Mary", 29, 7.2);
	
		Map<String,Estudiante> mapaEstudiantes =
				new HashMap<>();
		
		mapaEstudiantes.put("Z01", e1);
		mapaEstudiantes.put("Z02", e2);
		mapaEstudiantes.put("Z03", e3);
		mapaEstudiantes.put("Z04", e4);
		mapaEstudiantes.put("Z05", e5);
		
		System.out.println(mapaEstudiantes.get("Z04"));
		
		Set<String> setString = mapaEstudiantes.keySet();
		
		System.out.println(setString);
		
		System.out.println("---------");
		
		Collection<Estudiante> listaEstudiantes = 
				mapaEstudiantes.values();
		
		System.out.println(listaEstudiantes);


	}

}
