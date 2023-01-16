package constructores;

public class Principal {

	public static void main(String[] args) {

		String x = "hola"; //Exception
		//String x = new String("hola");
		
		StringBuilder sb = new StringBuilder("hello");
		
		Pato pato1 = new Pato();
		
		System.out.println(pato1.nombre); //null
		System.out.println(pato1.edad); //0
		
		System.out.println("----------------");
		
		Pato pato2 = new Pato("Lucas");
		
		System.out.println(pato2.nombre); //Lucas 
		
		Pato pato3 = new Pato("Donald",10);
		
		System.out.println(pato3.nombre);
		System.out.println(pato3.edad);

	}

}
