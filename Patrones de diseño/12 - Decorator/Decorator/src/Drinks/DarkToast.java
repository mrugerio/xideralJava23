package Drinks;

public class DarkToast extends Drink{
          double  price =(Math.random() * 50) + 1;
    public DarkToast() {
        setPrice(price);
        System.out.println("»DarkToast");
	}

}
