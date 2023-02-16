package adapter;

import payment.Methods.PayPal;

public class PaypalPaymentAdapter implements Payment {
    PayPal pal = new PayPal();

    @Override
    public void pay(double amount) {
        pal.sendPayment(amount);
    }
}
