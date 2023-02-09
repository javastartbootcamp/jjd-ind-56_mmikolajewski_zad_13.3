package pl.javastart.task;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;

public class Printer {
    static void printSumAllProductsValueInEuro(List<Product> products) {
        BigDecimal sum = new BigDecimal(0);
        for (Product product : products) {
            if (product.getCurrency().equals("EUR")) {
                sum = sum.add(product.getPrice());
            }
        }

        System.out.println("Suma wszystkich produktów w EUR: " + sum + "€");
    }

    static void printAverageOfProductsPriceInEuro(List<Product> products) {
        BigDecimal sum = new BigDecimal(0);
        int size = 0;
        for (Product product : products) {
            if (product.getCurrency().equals("EUR")) {
                sum = sum.add(product.getPrice());
                size++;
            }
        }
        BigDecimal avg = sum.divide(BigDecimal.valueOf(size), 4, RoundingMode.HALF_UP);
        System.out.println("" +
                "średniej wartości produkt w EUR: " + avg + "€");
    }

    static void printMostExpensiveProductPriceConvertedInEuro(List<Product> products) {
        BigDecimal expensivePrice = products.get(0).getPriceInEuro();
        for (Product product : products) {
            if (product.getPriceInEuro().compareTo(expensivePrice) > 0) {
                expensivePrice = product.getPriceInEuro();
            }
        }
        System.out.println("Najdroższy produkt w przeliczeniu na EUR: " + expensivePrice + "€");
    }

    static void printCheapestProductPriceConvertedInEuro(List<Product> products) {
        BigDecimal cheapestPrice = products.get(0).getPriceInEuro();
        for (Product product : products) {
            if (product.getPriceInEuro().compareTo(cheapestPrice) < 0) {
                cheapestPrice = product.getPriceInEuro();
            }
        }
        System.out.println("Najtańszego produkt w przeliczeniu na EUR: " + cheapestPrice + "€");
    }
}


