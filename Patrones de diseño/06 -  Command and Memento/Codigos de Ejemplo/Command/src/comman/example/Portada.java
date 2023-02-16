package comman.example;

// Elemento que permite abrir y cerrar la portada
public class Portada{
    
  public boolean conectar(){
   System.out.println("Conectando al sistema de la portada...");
    try{
        System.out.println("Conexión al sistema de la portada establecida.");
        return true;}
    catch(Exception e){
        System.out.println("No se ha podido establecer la conexión al sistema de la portada. ERROR:n"
                +e.getMessage());
        return false; }
        }

  public boolean desconectar(){
      System.out.println("Desconectando del sistema de la portada...");
      try{
          System.out.println("Se ha desconectado del sistema de la portada.");
          return true; }
      catch(Exception e){
          System.out.println("No se ha podido desconectar del sistema de la portada. ERROR:n"+e.getMessage());
          return false;}
        }

        public boolean abrir(){
            System.out.println("Abriendo la portada...");
            try{
                System.out.println("Portada abierta.");
                return true;}
            catch(Exception e){
                System.out.println("No se ha podido abrir la portada. ERROR:n"+e.getMessage());
                return false;
                }
        }

        public boolean cerrar(){
            System.out.println("Cerrando la portada...");
            try{
                System.out.println("Portada cerrada.");
                return true;}
            catch(Exception e){
                System.out.println("No se ha podido cerrar la portada. ERROR:n"+e.getMessage());
                return false;
            }
        }
}
