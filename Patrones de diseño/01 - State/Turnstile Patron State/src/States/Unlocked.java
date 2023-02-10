package States;
/**
 * @author Victor Lavalle
 */
public class Unlocked implements States{
    
@Override
 public void coin(TurnstileFSM f) {
 f.thanks();
 }
 
 @Override
 public void pass(TurnstileFSM f) {
 System.out.println("Passing[...]");
 f.setState(new Locked());
 f.lock();
 }
 
 @Override
 public void reset(TurnstileFSM f) { }
 
 @Override
 public void ready(TurnstileFSM f) {}
 
}
