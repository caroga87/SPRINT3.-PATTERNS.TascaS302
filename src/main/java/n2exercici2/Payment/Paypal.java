package n2exercici2.Payment;

public class Paypal extends PaymentMethod{
    public Paypal(PaymentCallback callback) {
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
