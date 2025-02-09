package CF7.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //μπορει να γραφτει ετσι, αφου το ArrayList υλοποιει το List
        //ειναι πιο flexible
        List<String> cities = new ArrayList<>();
        //μπορει να αλλαξει στο μελλον
        // πχ σε List<String> cities = new LinkedList<>();


        //το ιδιο ειναι και ετσι.
        ArrayList<String> cities2 = new ArrayList<>();


        //η add επιστρεφει παντα true στα ArrayList, οποτε δεν εχει πολυ
        // νοημα να το ελεγχουμε.
        //Μονο στα Set μπορει να επιστρεψει false , αν υπαρχει ηδη το
        // στοιχειο στο Set
        cities.add("Athens");
        cities.add("NY");
        cities.add("London");

        //για να γινει populate ενα ArrayList μπορουμε ειτε με add, ειτε
        //προσθετοντας κατευθειαν στον constructor ενα αλλο Collection.

        //μας επιστρεφει την city στο index 0;
        String firstCity = cities.get(0);

        //επιστρεφει το index που θα βρει το NY ή -1 αν δεν το βρει.
        int nyPosition = cities.indexOf("NY");
        if(nyPosition != -1){
            cities.set(nyPosition,"New York");
        }else{
            System.out.println("NY does not exist.");
        }

        if(cities.contains("Athens")){
            cities.remove("Athens");
        } else {
            System.out.println("Athens does not exist");
        }

        cities.removeIf(c -> c.startsWith("A"));

        //Iterate

        for(int i = 0 ; i < cities.size() - 1; i++){
            System.out.println(cities.get(i));
        }

        for(String city : cities) {
            System.out.println(city);
        }

        Iterator<String> it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        cities.forEach(city -> System.out.println(city));

        cities.forEach(System.out::println);
    }
}
