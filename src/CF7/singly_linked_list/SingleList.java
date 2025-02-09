package CF7.singly_linked_list;

public class SingleList<T> implements IList<T>{
    private Node<T> head = null;
    private Node<T> tail = null;
    int length = 0;

    //δεν ειναι απαραιτητο. ετσι κι αλλιως αρχικοποιειται σε null το head.
    public SingleList(){
    }

    @Override
    public void prepend(T item) {
        var newNode = new Node<T>();
        newNode.setItem(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
            length += 1;
            return;
        }
        newNode.setNext(head);
        head = newNode;
        length += 1;
    }

    @Override
    public void append(T item) {
        var newNode = new Node<T>();
        newNode.setItem(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
            length += 1;
            return;
        }
        tail.setNext(newNode);
        tail = newNode;
        length += 1;
    }

    @Override
    public void insertInIndex(T item, int index) {
        if(index < 0 || index > length){
            System.out.println("Invalid index");
        }
        var newNode = new Node<T>();
        newNode.setItem(item);
        if(index == 0) prepend(item);
        if(index == length) append(item);

        Node<T> temp = head;

        for(int i = 0 ; i < index-1 ; i++){
            temp = temp.getNext();
        }
        Node<T> after = temp.getNext();
        temp.setNext(newNode);
        newNode.setNext(after);
        length += 1;
    }

    @Override
    public T removeFirst() {
        if(length == 0) return null;
        Node<T> temp = head;
        if(length == 1){
            head = null;
            tail = null;
            length --;
            return temp.getItem();
        }
        head = head.getNext();
        temp.setNext(null);
        length --;
        return (T) temp.getItem();
    }

    @Override
    public T removeLast() {
        if(length == 0) return null;
        Node<T> temp = head;
        Node<T> nodeToReturn = tail;
        if(length == 1){
            head = null;
            tail = null;
            length --;
            return temp.getItem();
        }
        for(int i = 0 ; i < length-1 ; i++){
            temp = temp.getNext();
        }
        temp.setNext(null);
        tail = temp;
        length--;
        return nodeToReturn.getItem();
    }


    @Override
    public T getFromIndex(int index) {
        if(index < 0 || index > length){
            System.out.println("Invalid index");
            return null;
        }
        if(index == 0) return head.getItem();
        if(index == length) return tail.getItem();
        Node<T> temp = head;
        for(int i = 0 ; i < index ; i++){
            temp = temp.getNext();
        }
        return temp.getItem();
    }

    @Override
    public T removeFromIndex(int index) {
        if(index < 0 || index > length){
            System.out.println("Invalid index");
            return null;
        }
        if(index == 0) return removeFirst();
        if(index == length) return removeLast();
        Node<T> temp = head;
        Node<T> after = temp.getNext();
        for(int i = 0 ; i < index-1 ; i++){
            temp = temp.getNext();
            after = after.getNext();
        }
        temp.setNext(after.getNext());
        after.setNext(null);
        length --;
        return after.getItem();
    }

    @Override
    public void printList() {
        if(head == null) System.out.println("List is empty");
        Node<T> temp = head;
        for(int i = 0 ; i < length ; i++){
            System.out.print(temp.getItem() + " ");
            temp = temp.getNext();
        }
    }
}
