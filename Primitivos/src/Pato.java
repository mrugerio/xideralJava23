
public class Pato {
	
	String nombre;
	int edad;
	static boolean vuela = false;
	
	void makeSound() {
		String sound = "Quack";
		System.out.println(sound);
	}
	
	void eat(boolean debeComer) {
		String alimento = null;
		if (debeComer) {
			alimento = "hierbas";
		}
		System.out.println(alimento);

	}
	

}
