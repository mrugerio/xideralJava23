package constructores;

public class Pato {
	
	//Atributos de la Clase
	//Variables de (Instancia de Clase) (Objeto)
	String nombre; //null
	int edad; //0

	//Constructor default
	//Overloading (Sobrecarga) de Constructor
	Pato(){
		this("Default",5);
		//System.out.println("Default");
	}

	Pato(String name){		
		nombre = name;
	}

	Pato(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
}
