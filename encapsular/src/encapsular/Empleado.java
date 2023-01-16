package encapsular;

public class Empleado {

	//Variables de instancia de Clase
	private String nombre; //null
	private int edad; //0
	private boolean esSoltero; //false
	private StringBuilder puesto; //null
	
	public Empleado() {}
	
	public Empleado(String nombre, int edad, boolean esSoltero, StringBuilder puesto) {
		this.nombre = nombre;
		this.edad = edad;
		this.esSoltero = esSoltero;
		this.puesto = puesto;
	}

	//SobreEscritura
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", "
				+ "edad=" + edad + ", esSoltero=" + esSoltero + ", "
						+ "puesto=" + puesto+ "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad<0)
			System.out.println("Dato incorrecto");
		else
			this.edad = edad;
	}

	public boolean isEsSoltero() {
		return esSoltero;
	}

	public void setEsSoltero(boolean esSoltero) {
		this.esSoltero = esSoltero;
	}

	public StringBuilder getPuesto() {
		//Si tienen rol de Admin mostrar Puesto
		return puesto;
	}

	public void setPuesto(StringBuilder puesto) {
		this.puesto = puesto;
	}
	
	
	
	
	
}
