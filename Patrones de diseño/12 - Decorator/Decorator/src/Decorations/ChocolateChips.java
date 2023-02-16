package Decorations;
/**
*@author Victor Lavalle
*/
public class ChocolateChips extends DrinkDecorator {
   double  price =(Math.random() * 20) + 1;
    public ChocolateChips() {
        setPrice(price);
}
        @Override
       public String toString(){
        return "Chocolate Chips";
	}
}
