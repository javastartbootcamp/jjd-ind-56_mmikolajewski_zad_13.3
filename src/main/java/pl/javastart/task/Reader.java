package pl.javastart.task;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {

    public static List<Product> readProduct(String fileName) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            List<Product> products = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] split = line.split(";");
                Product nextProduct = new Product(split[0], new BigDecimal(split[1]), split[2]);
                products.add(nextProduct);
            }
            return products;
        }
    }

    public static List<Currency> readCurrency(String fileName) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            List<Currency> currencies = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] split = line.split(";");
                Currency nextCurrency = new Currency(split[0], new BigDecimal(split[1]));
                currencies.add(nextCurrency);
            }
            return currencies;
        }
    }
}
