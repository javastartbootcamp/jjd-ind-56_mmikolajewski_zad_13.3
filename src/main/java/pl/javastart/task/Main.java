package pl.javastart.task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            List<Product> products = Reader.readProduct("src/main/resources/products.csv");
            List<Current> currents = Reader.readCurrent("src/main/resources/currencies.csv");
            CurrencyCalculator.convertCurrencyFromListForProductsList(products, currents);
            Printer.printSumAllProductsValueInEuro(products);
            Printer.printAverageOfProductsPriceInEuro(products);
            Printer.printMostExpensiveProductPriceConvertedInEuro(products);
            Printer.printCheapestProductPriceConvertedInEuro(products);

        } catch (FileNotFoundException e) {
            System.out.println("Nie udało się wczytać pliku");
        }

    }
}
