package comman.example;

// Ahora definiremos los comandos concretos para cada acción
// (Concrete Commands)
// Comando para encender las luces
public class EncenderLuces implements Command{
    
private Luces luces;

 public EncenderLuces(){
  this.luces = new Luces();
  }

public void execute(){
    luces.conectar();
    luces.encender();
    luces.desconectar();
        }
}
