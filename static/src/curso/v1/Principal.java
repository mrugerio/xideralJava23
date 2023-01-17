package curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		Estudiante e1 = new Estudiante("Patrobas",15);
		Estudiante e2 = new Estudiante("Tercio",15);
		Estudiante e3 = new Estudiante("Andronico",15);
		
		System.out.println(e2.getNombreContador());
		
		int contador = Estudiante.getContador();
		System.out.println(contador);
		
	}

}
