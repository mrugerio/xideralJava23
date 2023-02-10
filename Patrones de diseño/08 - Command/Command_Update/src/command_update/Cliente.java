package command_update;
/**
 * @author Victor Lavalle
 */
public class Cliente {

    public Cliente(){
        
    Juego Game = new Juego();
    
    Game.setBotonA(new CommandBrincar());
    Game.setBotonB(new CommandCorrer());
    Game.setBotonX(new CommandDisparar());
    Game.setBotonY(new CommandInclinarse());
    
    Game.ejecutarComando(Boton.BotonY);
    Game.ejecutarComando(Boton.BotonA);
    Game.ejecutarComando(Boton.BotonB);
    Game.ejecutarComando(Boton.BotonX);
    }
   
    public static void main(String[] args) { 
        System.out.println("»COMMAND GAME«\n");
        Cliente cliente = new Cliente(); 
    }
    
}
