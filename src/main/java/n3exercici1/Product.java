package n3exercici1;

import n3exercici1.Currencies.Currency;

public class Product {
    private String name;
    private double price;
    private Currency currencyType;

    public Product(String name, double price, Currency currencyType) {
        this.name = name;
        this.price = price;
        this.currencyType = currencyType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Currency getCurrencyType() {
        return currencyType;
    }
}
