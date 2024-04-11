package n2exercici2;

import n2exercici2.Payment.PaymentCallback;

import java.util.Scanner;

public class MainShoeShop {
    public static void main(String[] args) {
        ShoeShop shop = new ShoeShop();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a payment method:\n1. Credit card\n2. PayPal\n3. Credit Bank account");

        int choice = scanner.nextInt();

        PaymentCallback callback = new PaymentCallback() {
            @Override
            public void onSuccess() {
                System.out.println("Payment successful!");
            }

            @Override
            public void onFailure() {
                System.out.println("Payment failed");
            }
        };
        try {
            switch (choice) {
                case 1:
                    shop.buyShoes("credit_card", callback);
                    break;
                case 2:
                    shop.buyShoes("paypal", callback);
                    break;
                case 3:
                    shop.buyShoes("bank_account", callback);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } catch (Exception e) {
            System.out.println("An error occurred during the payment process: " + e.getMessage());
        }
        scanner.close();
    }

}