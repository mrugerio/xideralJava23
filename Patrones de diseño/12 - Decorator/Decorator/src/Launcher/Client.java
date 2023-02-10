package Launcher;

import Decorations.*;
import Drinks.*;
import java.text.DecimalFormat;
/**
*@author Victor Lavalle
*/
public class Client {

    public static void main(String[] args) {
        
         double  order =(Math.random() * 10) + 1;
         DecimalFormat formatOrder = new DecimalFormat("#");          
         System.out.println("|Order # "+formatOrder.format(order)+"|");
         
         DecimalFormat formatPrice = new DecimalFormat("#.00");          
        DrinkDecorator cream = new WhippedCream();
        DrinkDecorator chips = new ChocolateChips();
        //_______________________________________________________ 

        Drink espresso = new Espresso();
        cream.addDrink(espresso);
        chips.addDrink(cream);
        System.out.println("With:"+"");
        System.out.println( "$"+formatPrice.format(chips.getPrice())+"\n");
        
        //_______________________________________________________

        Drink decaf = new Decaf();
        cream.addDrink(decaf);
        System.out.println( "$"+formatPrice.format(cream.getPrice())+"\n");
        
        //_______________________________________________________
        
        Drink houseBlend = new HouseBlend();
        System.out.println( "$"+formatPrice.format(houseBlend.getPrice()));
        
        //______________________________________________________
        
        System.out.println("\nThanks For Your Visit! :)");
	}
}
