package CF7.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMain {

    public static void main(String[] args) {

        List<String> cities = List.of("Athens", "London", "Toronto", "Torino");

        //αντι για List<String> tCities, γραφω var tCities, ειναι το ιδιο
        var tCities = cities.stream()
                    .filter(city->city.startsWith("T"))
                    .collect(Collectors.toList()); //mutable list
        //Η filter ελεγχει καθε στοιχειο της cities ως προς μια boolean
        // μεθοδο που περναμε εμεις σαν lambda.
        //αυτη η boolean μεθοδος ονομαζεται predicate.

        //η filter επιστρεφει stream. για να το κανουμε List χρησιμοποιουμε
        // το collect

        var tCities2 = cities.stream()
                .filter(city->city.startsWith("T"))
                .toList();  //immutable list


        tCities.forEach(System.out::println);

        //μπορουμε αν υπαρχουν παραπανω απο μια φορα καποια στοιχεια, να
        //παρουμε ενα collection μια εμφανιση καθε στοιχειου, χρησιμοποιωντας
        // Set. το παιρνουμε ειτε με Collectors.toSet() η με την HashSet
        Set<String> uniqueCityNames =
                cities.stream().collect(Collectors.toSet());

        //ειναι το ιδιο
        Set<String> uniqueCityNames2 = new HashSet<>(cities);


        //επιστρεφει την λιστα με ", " ως διαχωριστικο
        String strCities = cities.stream()
                .collect(Collectors.joining(", "));

        //το ιδιο
        String strCities2 = String.join(", ", cities);
    }
}
