package CF7.comparable_sort;

public class Product implements Comparable<Product>{

    private String name;
    private int price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ", " + price + ", " + quantity;
    }

    //κανει implements to Comparable (αρα μπορει να συγκριθει)
    //το Comparable ειναι functional interface και περιεχει την μεθοδο
    //compareTo.

    //αν θελουμε να μπορει να γινει sort ενα Collection με Products
    //πρεπει να κανουμε override την compareTo


    //εδω χρησιμοποιουμε την compareTo της κλασης String.
    //δινει +1 αν ειναι μεγαλυτερο , -1 αν ειναι μικροτερο και 0 αν ειναι ισα.
    @Override
    public int compareTo(Product o) {
        return this.name.compareTo(o.name);
    }
}
