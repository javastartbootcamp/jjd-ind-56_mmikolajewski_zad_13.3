package pl.javastart.task;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Product {
    private String name;
    private BigDecimal price;
    private String currency;

    private BigDecimal priceInEuro;

    public Product(String name, BigDecimal price, String currency) {
        this.name = name;
        this.price = price;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getPriceInEuro() {
        return priceInEuro;

    }

    public void updatePriceInEuro(List<Currency> listOfCurrentsDataBase) {
        for (Currency currency : listOfCurrentsDataBase) {
            if (this.currency.equals(currency.getName())) {
                priceInEuro = price.divide(currency.getRate(), 3, RoundingMode.HALF_UP);
            }
        }
    }

    @Override
    public String toString() {
        return name + ", price: " + price +
                ", currency:" + currency;
    }
}
