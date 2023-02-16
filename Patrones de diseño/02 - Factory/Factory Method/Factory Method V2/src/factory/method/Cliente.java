package factory.method;

public class Cliente {

    public Cliente(){ }
    
    public String encriptar(String texto, FactoryAlgoEncriptamiento factory) {
        AlgoritmoEncriptamiento encriptador = factory.create();
        return encriptador.encriptar(texto);
    }
    
    public String desencriptar(String texto, FactoryAlgoEncriptamiento factory) {
        AlgoritmoEncriptamiento desencriptador = factory.create();
        return desencriptador.desencriptar(texto);
    }
     
  public static void main(String args[]) {
      String cadenaEncriptada;
      cadenaEncriptada = new Cliente().encriptar("Hola",new FactoryAlgoEncripGHash());
      System.out.println(cadenaEncriptada+"\n");
      
      String cadenaDesencriptada;
      cadenaDesencriptada=new Cliente().desencriptar("0xQM9GGhFwHK4h1TFmFbBw==",new FactoryAlgoEncripGHash());
      System.out.println(cadenaDesencriptada+"\n");
      //____________________________________________________________________
      cadenaEncriptada = new Cliente().encriptar("Hola", new FactoryAlgoEncripKHash());
      System.out.println(cadenaEncriptada+"\n");
      
       cadenaDesencriptada=new Cliente().desencriptar("jLkPaQStligov95QZ487Zg==",new FactoryAlgoEncripKHash());
      System.out.println(cadenaDesencriptada+"\n");
        }
}