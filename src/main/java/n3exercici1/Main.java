package n3exercici1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ExchangeCurrency exchangeCurrency = new ExchangeCurrency();
        Product producto = new Product("Table", 25.55, exchangeCurrency);

         for (String moneda : exchangeCurrency.getDisponibleCurrency()) {
            producto.price(moneda);
        }

    }
}
