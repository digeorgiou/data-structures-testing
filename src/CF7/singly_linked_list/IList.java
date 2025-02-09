package CF7.singly_linked_list;

public interface IList<T> {

    public void prepend(T item);
    public void append(T item);
    public void insertInIndex(T item, int index);
    public T removeFirst();
    public T removeLast();
    public T getFromIndex(int index);
    public T removeFromIndex(int index);
    public void printList();

}
