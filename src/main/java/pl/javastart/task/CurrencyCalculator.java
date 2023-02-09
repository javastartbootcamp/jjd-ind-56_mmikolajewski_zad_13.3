package pl.javastart.task;

import java.util.List;

public class CurrencyCalculator {
    public static void convertCurrencyFromListForProductsList(List<Product> productsList, List<Currency> currencies) {
        for (int i = 0; i < productsList.size(); i++) {
            productsList.get(i).updatePriceInEuro(currencies);
        }
    }
}
