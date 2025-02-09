package CF7.streams;

import java.util.Comparator;
import java.util.List;

public class SortingMain {

    public static void main(String[] args) {

        List<Product> products = List.of(new Product("Apples",10.5,45),
                new Product("Oranges", 8.5, 20),
                new Product("Mango", 18.5, 20),
                new Product("Strawberries", 12.4,30),
                new Product("Oranges", 8.5, 60));

        //ειναι μια νεα λιστα. δεν επηρεαζεται η αρχικη.
        var sortedProducts = products.stream()
                .sorted(Comparator.comparing(Product::getName));
    }
}
