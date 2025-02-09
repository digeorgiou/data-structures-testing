package CF7.singly_linked_list;

public class Main {
    public static void main(String[] args) {

    SingleList<Integer> myList= new SingleList<Integer>();

    myList.prepend(5);
    myList.prepend(3);
    myList.prepend(2);
    myList.prepend(12);

    myList.append(23);
    myList.append(42);

    myList.insertInIndex(100, 3);

    myList.printList();
        System.out.println();

        System.out.println(myList.removeFirst());
        myList.printList();
        System.out.println();
        System.out.println(myList.removeLast());
        myList.printList();
        System.out.println();

        System.out.println(myList.removeFromIndex(2));
        myList.printList();
    }

}
