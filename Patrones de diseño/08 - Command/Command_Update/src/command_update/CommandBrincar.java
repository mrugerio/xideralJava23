package command_update;
/**
 * @author Victor Lavalle
 */
public class CommandBrincar implements Command {
    @Override
    public void ejecutar(Personaje per) {
            per.brincar();
    }
}
