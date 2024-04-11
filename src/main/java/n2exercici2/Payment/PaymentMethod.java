package n2exercici2.Payment;

public abstract class PaymentMethod {
    protected PaymentCallback callback;

    public PaymentMethod(PaymentCallback callback) {
        this.callback = callback;
    }

    public abstract void makePayment();
}
