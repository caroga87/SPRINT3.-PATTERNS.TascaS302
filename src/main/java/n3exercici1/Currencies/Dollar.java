package n3exercici1.Currencies;

public class Dollar implements Currency{
    private double value = 1.07;

    @Override
    public String getCurrencyType() {
        return "dollars";
    }

    @Override
    public double getCurrencyValue() {
        return value;
    }
}
