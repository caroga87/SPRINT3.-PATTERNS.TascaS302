package n2exercici2;

import n2exercici2.Payment.*;

public class ShoeShop {

    public void buyShoes(String paymentMethod, PaymentCallback callback) {
        PaymentMethod payment;

        switch (paymentMethod) {
            case "credit_card":
                payment = new CreditCard(callback);
                break;
            case "paypal":
                payment = new Paypal(callback);
                break;
            case "bank_account":
                payment = new BankAccount(callback);
                break;
            default:
                throw new IllegalArgumentException("Invalid payment method");
        }

        payment.makePayment();
    }
}
