package n3exercici1.Currencies;

public class GBP implements Currency{
    private double value= 0.86;

    @Override
    public String getCurrencyType() {
        return "pounds";
    }

    @Override
    public double getCurrencyValue() {
        return value;
    }
}
