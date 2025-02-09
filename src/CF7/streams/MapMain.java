package CF7.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMain {
    public static void main(String[] args) {

        List<Product> products = List.of(new Product("Apples",10.5,45),
                new Product("Oranges", 8.5, 20),
                new Product("Mango", 18.5, 20),
                new Product("Strawberries", 12.4,30),
                new Product("Oranges", 8.5, 60));


        ArrayList<String> listOfFruitNames = products.stream()
                .map(Product::getName)
                .collect(Collectors.toCollection(ArrayList::new));

        //αθροιζει την ποσοτητα σε ολα τα Products με name: Oranges
        int totalQuantities = products.stream()
                .filter(p->p.getName().equals("Oranges"))
                .mapToInt(Product::getQuantity)
                .sum();
    }
}
