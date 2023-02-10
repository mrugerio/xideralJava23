package Drinks;

public class Espresso extends Drink{
      double  price =(Math.random() * 50) + 1;
    public Espresso() {
        setPrice(price);
        System.out.println("»Espresso");
	}
}
