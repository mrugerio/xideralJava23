package com.curso.v6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoTryResource {
	
	public static void main(String[] args) {
		File file = new File("E://archivo.txt");
		
		//Try With Resources
		try (FileReader fr = leerArchivo(file)) {
			System.out.println("Varis operaciones");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
	}

	public static FileReader leerArchivo(File file) 
								throws FileNotFoundException {
		FileReader fr = new FileReader(file);
		return fr;
	}
}
