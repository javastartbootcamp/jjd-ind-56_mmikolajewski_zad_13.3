package pl.javastart.task;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

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

    public void updatePriceInEuro(List<Current> listOfCurrentsDataBase) {
        for (Current current : listOfCurrentsDataBase) {
            if (currency.equals(current.getName())) {
                priceInEuro = price.divide(current.getRate(), 3, RoundingMode.HALF_UP);
            }
        }
    }

    @Override
    public String toString() {
        return name + ", price: " + price +
                ", currency:" + currency;
    }
}
