package CF7.comperator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Κανουμε populate την List μας με καποια απο τις παρακατω μεθοδους.


        //η List.of επιστρεφει Immutable List
        List<Product> productList1 = List.of(new Product("A", 12.5, 10),
                new Product("B", 14.5, 3),
                new Product("C", 11.0, 5),
                new Product("D", 5.5, 4));

        //η Arrays.asList επιστρεφει Partially-Immutable List (επιτρεπει
        // update, αλλα οχι insert και delete.
        List<Product> productList2 = Arrays.asList(new Product("A", 12.5, 10),
                new Product("B", 14.5, 3),
                new Product("C", 11.0, 5),
                new Product("D", 5.5, 4));

        //ειναι και οι δυο static factories


        //με τον Constructor της ArrayList μπορουμε να παρουμε mutable List.
        List<Product> productList3 = new ArrayList<>(List.of(new Product("A", 12.5, 10),
                new Product("B", 14.5, 3),
                new Product("C", 11.0, 5),
                new Product("D", 5.5, 4)));


        //η sort εδω παιρνει σαν ορισμα εναν Comparator, ειναι ενα functional
        // interface.
        productList3.sort(Comparator.naturalOrder());
        //με το naturalOrder γινεται sort based on Comparable

        productList3.sort(Comparator.reverseOrder());
        //παλι με βαση το Comparable


        /**
         * η comparing παιρνει ενα functional interface σαν παραμετρο
         */
        //productList3.sort(Comparator.comparing(p -> p.getName()));
        // επειδη εχουμε p και αριστερα και δεξια στο lambda
        // μπορουμε νατο γραψουμε και ετσι (method reference).
        productList3.sort(Comparator.comparing(Product::getName));


        //με τον Comparator μπορει να γινει κι αλλο sort με το then
        productList3.sort(Comparator.comparing(Product::getName).thenComparing(Product::getQuantity));

        //αν βαλω reversed στο τελος , αντιστρεφεται η λιστα.
        productList3.sort(Comparator.comparing(Product::getName).thenComparing(Product::getQuantity).reversed());

        //το μειονεκτημα του Comparator ειναι οτι οταν κανει sort , χανεται η
        // αρχικη λιστα. Ιδανικα θα θελαμε να επιστρεφει νεο αντιγραφο.
    }
}
