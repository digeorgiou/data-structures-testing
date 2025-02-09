package CF7.streams;

import java.util.List;
import java.util.Optional;

public class FindAndMatch {

    public static void main(String[] args) throws Exception {

        List<String> names = List.of("Alice", "Bob", "Charlie", "David",
                "Billy");


        //Optional is a class/container for wrapping null.
        // Avoids NullPointerException
        Optional<String> query = names.stream()
                .filter(name -> name.equals("Alice"))
                .findFirst();

        if (query.isPresent()) {
            System.out.println("Firstname: " + query.get());
        }

        query.ifPresent(first-> System.out.println("First name" + first));


        String strFirst = names.stream()
                .filter(name -> name.equals("Bob"))
                .findFirst().orElse(null);

        String strFirst2 = names.stream()
                .filter(name -> name.equals("Bob"))
                .findFirst().orElseThrow(()->new Exception("Alice does not " +
                        "exist"));

        //στα παραπανω μεχρι και το findFirst() ειναι κλαση Optional.
        //με την orElse και την orElseThrow μετατρεπεται το Optional στο
        // περιεχομενο του. (εδω String)


        // Match
        //anyMatch ελεγχει αν υπαρχει οποιοδηποτε
        boolean isBobExists = names.stream()
                .anyMatch(name -> name.equals("Bob"));

        //ελεγχει αν ολα ειναι Bob
        boolean areAllBob = names.stream()
                .allMatch(name->name.equals("Bob"));

        //ελεγχει αν κανενα δεν ειναι Bob
        boolean noneIsBob = names.stream()
                .noneMatch(name->name.equals("Bob"));
    }


}
