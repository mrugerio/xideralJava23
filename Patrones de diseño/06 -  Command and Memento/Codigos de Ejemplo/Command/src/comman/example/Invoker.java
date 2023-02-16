package comman.example;

// Ahora vamos a definir el Invoker, que simplemente será
// el encargado de llamar a una orden
public class Invoker {
    
 private final Command orden;
   
        public Invoker(Command orden){ 
            this.orden = orden;
        }
        
        public void run(){
            orden.execute();
        }
}
