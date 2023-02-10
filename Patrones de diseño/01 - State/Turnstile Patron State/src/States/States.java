package States;
/**
 * @author Victor Lavalle
 */
public interface States {
public void coin(TurnstileFSM f);
 
 public void pass(TurnstileFSM f);

 public void reset(TurnstileFSM f);

 public void ready(TurnstileFSM f);
}
