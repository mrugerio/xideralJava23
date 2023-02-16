package command_update;
/**
 * @author Victor Lavalle
 */
public class CommandCorrer implements Command{
    @Override
    public void ejecutar(Personaje per) {
        per.correr();
    }  
}
