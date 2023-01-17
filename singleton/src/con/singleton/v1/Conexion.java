package con.singleton.v1;

public class Conexion {
	
	//HAS-A (COMPOSICION)
	static private Conexion conexion = 
			new Conexion("Mysql");
	
	private String nombre;
	static int contador;
	
	private Conexion(String nombre) {
		//CONECTA A DB
		contador++;
	}
	
	static public Conexion getInstace() {
		return conexion;
	}

}
