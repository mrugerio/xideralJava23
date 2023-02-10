package comman.example;

// Comando para cerrar la portada
public class CerrarPortada implements Command{
    
    private Portada portada;
    
  public CerrarPortada(){
      this.portada = new Portada();
  }
  
    @Override
  public void execute(){
      portada.conectar();
      portada.cerrar();
      portada.desconectar();
        }
}
