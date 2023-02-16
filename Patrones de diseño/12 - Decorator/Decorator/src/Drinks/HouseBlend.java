package Drinks;

public class HouseBlend extends Drink{
          double  price =(Math.random() * 50) + 1;
    public HouseBlend() {
        setPrice(price);
        System.out.println("»HouseBlend");
	}
}
