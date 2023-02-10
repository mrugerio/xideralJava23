package States;
/**
 * @author Victor Lavalle
 */
public class TurnstileFSM extends Turnstile {
 private States state;

 public TurnstileFSM(){
 state = new Locked();
 }
 
public void setState(States s){ state = s;}

 public void coin(){ state.coin(this); }

 public void pass(){ state.pass(this); }

 public void reset(){ state.reset(this); }

 public void ready(){ state.ready(this); }

}
