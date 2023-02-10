package factory.method;


public class Cliente {
	
	public Cliente() {}
	
	public String encriptar(String texto, String algo) {
                AlgoEncriptamiento encriptador = FactoryAlgoEncriptamiento.createInstance(algo);
                return encriptador.encriptar(texto);
	}
        public String desencriptar(String texto, String algo) {
                AlgoEncriptamiento desencriptador = FactoryAlgoEncriptamiento.createInstance(algo);
                return desencriptador.desencriptar(texto);
	}
        

	public static void main (String args[]) {
		String cadenaEncriptada;
                                   String cadenaDesencriptada;
		cadenaEncriptada = new Cliente().encriptar("Send nudes uwu ", "ghash");
                                   System.out.println(cadenaEncriptada+"\n"); 
                                   cadenaDesencriptada = new Cliente().desencriptar("QQ0442znpBZp7f1Rm9Rvfg==", "ghash");
		System.out.println(cadenaDesencriptada);
	}
}
