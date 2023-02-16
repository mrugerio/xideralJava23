package comman.example;

// Comando para apagar las luces
public class ApagarLuces implements Command{
    private Luces luces;

    public ApagarLuces(){
        this.luces = new Luces();
    }

    @Override
    public void execute(){
        luces.conectar();
        luces.apagar();
        luces.desconectar();
        }
}
