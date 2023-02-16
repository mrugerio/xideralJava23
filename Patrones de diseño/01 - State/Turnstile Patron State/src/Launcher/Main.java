package Launcher;
/**
 * @author Victor Lavalle
*/
import States.*;
import java.util.Scanner;

public class Main {
  
    public static void Menu(){
     System.out.println("Select an Option:"
             + "\n ___________________"
             + "\n|1. Insert Coin    |"
             + "\n|2. Pass           |"
             + "\n|3. Reset          |"
             + "\n|4. Ready          |"
             + "\n|0. Exit           |"
             + "\n -------------------"
             + "\n>>");
    }
       
    public static void main(String[] args) {
        
        Scanner scanAction = new Scanner(System.in);
        TurnstileFSM turnstile = new TurnstileFSM();
        
        turnstile.setState(new Locked());
        System.out.println("   *Turnstile*");
  
        while(true){
           Menu();
           String  action= scanAction.nextLine();
            switch(action){
                
                 case "0":
                    System.exit(0);
                break;
                case "1":
                   turnstile.coin(); 
                break;
                
                case "2":
                   turnstile.pass();
                break;
                
                case "3":
                    turnstile.reset();
                 break;
                 
                 case "4":
                    turnstile.ready();
                 break;
                
                default:  System.out.println("Invalid Option!");
            }
        }
    }
}
