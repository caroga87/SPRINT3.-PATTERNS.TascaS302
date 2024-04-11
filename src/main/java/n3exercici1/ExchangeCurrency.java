package n3exercici1;

import n3exercici1.Currencies.Currency;

public class ExchangeCurrency {
    private Currency currencyType;

    public ExchangeCurrency(Currency currencyType) {
        this.currencyType = currencyType;
    }

    public Currency getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(Currency currencyType) {
        this.currencyType = currencyType;
    }

    public double changeCurrency (Currency initial, double quantity){

    }
}
