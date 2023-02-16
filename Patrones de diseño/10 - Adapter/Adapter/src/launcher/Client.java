package launcher;

import adapter.*;

public class Client {
    
    public Client() {}
	
    public void makePayment(Payment method, double amount) {
        method.pay(amount);
    }
	
         public static void main(String args[]) {
             Client client = new Client();
             client.makePayment(new DebitPaymentAdapter(), 100);
             client.makePayment(new CreditPaymentAdapter(), 200);
             client.makePayment(new PaypalPaymentAdapter(), 300);
	}
}
