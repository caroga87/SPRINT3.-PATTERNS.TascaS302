package n2exercici2.Payment;

public class CreditCard extends PaymentMethod{
    public CreditCard(PaymentCallback callback) {
        super(callback);
    }

    @Override
    public void makePayment() {

        if (Math.random() < 0.5) {
            callback.onSuccess();
        } else {
            callback.onFailure();
        }
    }
}
