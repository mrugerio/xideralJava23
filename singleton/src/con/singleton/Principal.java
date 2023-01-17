package con.singleton;

public class Principal {

	public static void main(String[] args) {

		Conexion con1 = Conexion.getInstace();
		Conexion con2 = Conexion.getInstace();
		Conexion con3 = Conexion.getInstace();
		Conexion con4 = Conexion.getInstace();
		Conexion con999 = Conexion.getInstace();
		
		System.out.println(con4); 

		System.out.println(Conexion.contador); //1

	}

}
