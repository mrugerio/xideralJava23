package States;
/**
 * @author Victor Lavalle
 */
public class Locked implements States{
    
 @Override
 public void coin(TurnstileFSM f) {
 f.setState(new Unlocked());
 f.unlock();
 }
 
 @Override
 public void pass(TurnstileFSM f) {
 f.alarm();
 f.setState(new Violation());
 }
 
 @Override
 public void reset(TurnstileFSM f) { }
 
 @Override
 public void ready(TurnstileFSM f) { }
 
}
