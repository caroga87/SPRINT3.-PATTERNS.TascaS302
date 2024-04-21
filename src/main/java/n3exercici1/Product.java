package n3exercici1;

public class Product {
    private String name;
    private double price;
    private ExchangeCurrency exchangeCurrency;

    public Product(String name, double price, ExchangeCurrency exchangeCurrency) {
        this.name = name;
        this.price = price;
        this.exchangeCurrency = exchangeCurrency;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void price (String currency) {
        double changeCurrency = exchangeCurrency.converter(price, currency);
        System.out.println("The price of the " +name +" is " +price +" wich is equivalent to " +String.format ("%.2f", changeCurrency) +" " +currency);
    }
}
