public class Cliente {

	public String encriptar(String texto, FactoryAlgoEncriptamiento factory) {
		AlgoritmoEncriptamiento encriptador = factory.create();
		return encriptador.encriptar(texto);
	}
	public String desencriptar(String texto, FactoryAlgoEncriptamiento factory) {
		AlgoritmoEncriptamiento encriptador = factory.create();
		return encriptador.desencriptar(texto);
	}
	public static void main(String args[]) {
		String cadenaEncriptada;
		cadenaEncriptada = new Cliente().encriptar("Hola esto es una prueba", new FactoryAlgoEncripGHash());
		System.out.println(cadenaEncriptada);
                                   System.out.println("");
                                   
                                   cadenaEncriptada = new Cliente().encriptar("Hola esto es una prueba", new FactoryAlgoEncripKHash());
		System.out.println(cadenaEncriptada);
                                   System.out.println("");
                                   
		cadenaEncriptada = new Cliente().desencriptar("876swwUgCW/kAy/cryoPgY6OmKZbC6PtZeb+9upHVQg=", new FactoryAlgoEncripGHash());
		System.out.println(cadenaEncriptada);
                                   System.out.println("");
                                   
                                   cadenaEncriptada = new Cliente().desencriptar("liGHNiYTkc78Pp8yvxm/CUuMqa9hkeFRFvuSiQDjIY4=", new FactoryAlgoEncripKHash());
		System.out.println(cadenaEncriptada);
	}

}