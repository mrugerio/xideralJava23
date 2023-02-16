package adapter;

import payment.Methods.CreditCard;

public class CreditPaymentAdapter implements Payment {
    CreditCard credit = new CreditCard();

    @Override
    public void pay(double amount) {
        credit.executePay(amount);
    }
}
