package adapter;

import payment.Methods.DebitCard;

public class DebitPaymentAdapter implements Payment {
    DebitCard debit = new DebitCard();

    @Override
    public void pay(double amount) {
        debit.payment(amount);
    }
}
