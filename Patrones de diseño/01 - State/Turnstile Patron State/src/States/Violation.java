package States;
/**
 * @author Victor Lavalle
 */
public class Violation implements States {
    
@Override
 public void coin(TurnstileFSM f) {}
 
 @Override
 public void pass(TurnstileFSM f) {}

 @Override
 public void reset(TurnstileFSM f){
 f.resetAlarm();
 }

 @Override
 public void ready(TurnstileFSM f){
 f.resetAlarm();
 f.setState(new Locked());
 f.lock();
 }
 
}
