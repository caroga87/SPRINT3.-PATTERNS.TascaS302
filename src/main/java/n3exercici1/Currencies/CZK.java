package n3exercici1.Currencies;

public class CZK implements Currency{
    private double value = 25.43;

    @Override
    public String getCurrencyType() {
        return "czech koruna";
    }

    @Override
    public double getCurrencyValue() {
        return value;
    }
}
