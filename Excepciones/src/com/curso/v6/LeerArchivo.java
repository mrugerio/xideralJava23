package com.curso.v6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
	
	public static void main(String[] args) {
		File file = new File("E://archivo.txt");
		FileReader fr = null;
		try {
			fr = leerArchivo(file);
			System.out.println("Varis operaciones");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static FileReader leerArchivo(File file) 
								throws FileNotFoundException {
		FileReader fr = new FileReader(file);
		return fr;
	}
}
