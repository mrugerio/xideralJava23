package curso.v1;

public class Estudiante {

	//Variables de Instancia de Clase
	String nombre;
	int edad;
	
	//Variables de Clase
	private static int contador; //0
	
	public Estudiante(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}
	
	//Método de Clase
	static int getContador() {
		return contador;
	}
	
	//Métodos de Clase NO TIENEN ACCESO a los atributos de instancia de clase

	//Método de instancia de Clase
	String getNombreContador() {
		return nombre+": "+contador;
	}
	
	//Métodos de instancia de Clase SI TIENEN ACCESO a los atributos de clase
	
}
