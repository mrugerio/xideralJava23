package curso.v0;

public class Estudiante {

	//Variables de Instancia de Clase
	String nombre;
	int edad;
	
	//Variables de Clase
	static int contador = 100; //0
	
	public Estudiante(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		contador++;
		//++contador;
		//contador = contador +1;
	}
	
}
