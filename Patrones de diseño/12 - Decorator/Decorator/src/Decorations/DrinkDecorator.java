package Decorations;

import Drinks.Drink;

/**
 * @author Victor Lavalle
 */
public abstract class DrinkDecorator extends Drink {
    
    private Drink drink;
    
        public Drink getDrink() {return drink;}
        
        public void addDrink(Drink drink) {
            this.drink = drink;
            setPrice(drink.getPrice() + getPrice());
	}
		
}
