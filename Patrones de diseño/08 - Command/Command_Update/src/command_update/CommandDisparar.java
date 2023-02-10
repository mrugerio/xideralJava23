package command_update;
/**
 * @author Victor Lavalle
 */
public class CommandDisparar implements Command{
    @Override
    public void ejecutar(Personaje per) {
      per.disparar();
    }
}
