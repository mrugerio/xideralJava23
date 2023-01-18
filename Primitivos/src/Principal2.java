import java.math.BigDecimal;

public class Principal2 {
	
	public static void main(String[] args) {
		Principal2 prin2 = new Principal2();
		
		int resultado = prin2.calcular();
		System.out.println(resultado); //0
	}
	
	int calcular() {
		//VARIABLES LOCALES
		//NO SE INICIALIZAN
		int x;
		int y;
		
		x=0;
		y=0;
		
		return x+y;
	}
	
	String getCadena() {
		//VARIABLES LOCALES
		//NO SE INICIALIZAN
		String cadena;
		cadena = "hola";
		return cadena;
	}
	
	String getCadenaRaro() {
		//VARIABLES LOCALES
		//NO SE INICIALIZAN
		String cadena;
		cadena = null;
		return cadena;
	}
	
}
