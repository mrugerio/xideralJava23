package curso.v0;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Estudiante.contador);

		Estudiante e1 = new Estudiante("Patrobas",15);
		Estudiante e2 = new Estudiante("Tercio",15);
		Estudiante e3 = new Estudiante("Andronico",15);

//		System.out.println(e1.contador); //3
//		System.out.println(e2.contador); //3
//		System.out.println(e3.contador); //3
		
		Estudiante.contador = 999;
		
		System.out.println(Estudiante.contador);
		
	}

}
