package encapsular;

public class Principal {

	public static void main(String[] args) {

		Empleado e1 = new Empleado("Andronico",
				20,false,new StringBuilder("Developer"));
		
		//e1.edad = -10;
		e1.setEdad(-10);
		//e1.esSoltero = true;
		e1.setEsSoltero(true);
		//e1.puesto = new StringBuilder("Tester");
		e1.setPuesto(new StringBuilder("Tester"));
		
		System.out.println(e1.getEdad());
		System.out.println(e1.isEsSoltero());
		System.out.println(e1.getPuesto());


	}

}
