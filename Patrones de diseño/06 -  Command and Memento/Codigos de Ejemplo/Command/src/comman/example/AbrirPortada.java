package comman.example;

// Comando para abrir la portada
public class AbrirPortada implements Command{
    private Portada portada;

  public AbrirPortada(){
      this.portada = new Portada();
  }
  
    @Override
  public void execute(){
      portada.conectar();
      portada.abrir();
      portada.desconectar();
        }
}
