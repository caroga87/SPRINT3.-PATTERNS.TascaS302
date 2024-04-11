package n2exercici2.Payment;

public class BankAccount extends PaymentMethod {
    public BankAccount(PaymentCallback callback) {
        super(callback);
    }

    @Override
    public void makePayment() {
        // Simulación de la comprobación de fondos
        if (Math.random() < 0.5) {
            callback.onSuccess();
        } else {
            callback.onFailure();
        }
    }
}