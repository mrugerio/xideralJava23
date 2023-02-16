package Decorations;
/**
 * @author Victor Lavalle
 */
public class WhippedCream extends DrinkDecorator{
    public WhippedCream() {
       double  price =(Math.random() * 20) + 1;
        setPrice(price);
	}
       @Override
       public String toString(){
        return "Whipped Cream";
       }
}
