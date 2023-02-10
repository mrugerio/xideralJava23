package Drinks;

public class Decaf extends Drink{
       double  price =(Math.random() * 50) + 1;
    public Decaf() {
        setPrice(price);
        System.out.println("»Decaf");
    }
    }
