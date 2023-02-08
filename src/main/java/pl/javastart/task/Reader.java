package pl.javastart.task;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {

    public static List<Product> readProduct(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        List<Product> products = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(";");
            Product nextProduct = new Product(split[0], new BigDecimal(split[1]), split[2]);
            products.add(nextProduct);
        }
        return products;
    }

    public static List<Current> readCurrent(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        List<Current> currents = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(";");
            Current nextCurrent = new Current(split[0], new BigDecimal(split[1]));
            currents.add(nextCurrent);
        }
        return currents;
    }
}
