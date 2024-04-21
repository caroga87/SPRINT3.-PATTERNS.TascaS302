package n3exercici1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExchangeCurrency {

    private Map <String, Double> converter;

    public ExchangeCurrency () {
        converter = new HashMap<>();
        converter.put("EUR",1.0); // euro com a moneda base
        converter.put("USD", 1.06); // 1 euro = 1.06 dollars
        converter.put("GBP", 0.85); // 1 euro = 0,85 lliures
        converter.put("CZK",25.23); // 1 euro = 25,23 corones txeques
    }

    public double converter (double price, String currency){
        double changeRate = converter.get(currency);
        return price * changeRate;
    }

    public Set<String> getDisponibleCurrency() {
        return converter.keySet();
    }

}
