package comman.example;

public class Lanzador {

    public static void main(String[] args) {
        
      Command command = null;
      String[] array = {"abrir","portada"};
        if(array[0].equals("encender") && array[1].equals("luces")){
            command = new EncenderLuces();
        }
        else if(array[0].equals("apagar") && array[1].equals("luces")){
                command = new ApagarLuces();
        } 
        else if(array[0].equals("abrir") && array[1].equals("portada")){
            command = new AbrirPortada();
        }
        else if(array[0].equals("cerrar") && array[1].equals("portada")){
            command = new CerrarPortada();
        }
        Invoker invoker = new Invoker(command);
        invoker.run();
    }
}
