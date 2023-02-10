package comman.example;

// Ahora definiremos una serie de clases que implementarán la funcionalidad
// correspondiente al elemento de nuestra casa inteligente que queremos 
// utilizar (Receivers).
// Elemento que permite apagar y encender las luces
public class Luces{

       public boolean conectar(){
           System.out.println("Conectando al sistema de iluminación...");
           try{
               System.out.println("Conexión al sistema de iluminación establecida.");
               return true;
                }
           catch(Exception e){
               System.out.println("No se ha podido establecer la conexión al sistema de iluminación. ERROR:n"
                       +e.getMessage());
               return false;
                }
        }

        public boolean desconectar(){
            System.out.println("Desconectando del sistema de iluminación...");
            try{
                System.out.println("Se ha desconectado del sistema de iluminación.");
                return true;
                }
            catch(Exception e){
                System.out.println("No se ha podido desconectar del sistema de iluminación. ERROR:n"
                        +e.getMessage());
                return false;
                }
        }

        public boolean encender(){
            System.out.println("Encendiendo el sistema de iluminación...");
            try{
                System.out.println("Sistema de iluminación encendido.");
                return true;
                }
            catch(Exception e){
                System.out.println("No se ha podido encender el sistema de iluminación. ERROR:n"
                        +e.getMessage());
                return false;
                }
        }

        public boolean apagar(){
            System.out.println("Apagando el sistema de iluminación...");
            try{
                System.out.println("Sistema de iluminación apagado.");
                return true;
                }
            catch(Exception e){
                System.out.println("No se ha podido apagar el sistema de iluminación. ERROR:n"
                        +e.getMessage());
                return false;
                }
        }  }

