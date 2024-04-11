package n3exercici1.Currencies;

public class Euro implements Currency {

    private double value=1;

    @Override
    public String getCurrencyType() {
        return "euros";
    }

    @Override
    public double getCurrencyValue() {
        return value;
    }
}
