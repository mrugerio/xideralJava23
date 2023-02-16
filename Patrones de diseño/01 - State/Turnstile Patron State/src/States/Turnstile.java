package States;
/**
 * @author Victor Lavalle
 */
public class Turnstile {
    
 public void lock(){
 System.out.println("Locked\n");
 }

 public void unlock(){
 System.out.println("Unlocked\n");
 }

 public void thanks(){
 System.out.println("Thanks!\n");
 }

 public void alarm(){
 System.out.println("Sounding alarm...!\n");
 }

 public void resetAlarm(){
 System.out.println("Alarm stopped\n");
 }
    
}
