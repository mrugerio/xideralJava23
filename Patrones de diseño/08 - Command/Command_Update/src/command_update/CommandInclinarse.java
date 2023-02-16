package command_update;
/**
 * @author Victor Lavalle
 */
public class CommandInclinarse implements Command {
    @Override
    public void ejecutar(Personaje per) {
      per.inclinarse();
    }
}
