package CF7.collection_interface;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

/**
 * Το interface Deque κληρονομει το Queue και χρησιμοποιειται για
 * να κανει queues και stacks (LIFO , FIFO)
 * Υλοποειται απο την κλαση ArrayDeque , αλλα και την LinkedList
 */
public interface IDeque extends Deque {

    @Override
    void addFirst(Object o);

    @Override
    void addLast(Object o);

    @Override
    boolean offerFirst(Object o);

    @Override
    boolean offerLast(Object o);

    @Override
    Object removeFirst();

    @Override
    Object removeLast();

    @Override
    Object pollFirst();

    @Override
    Object pollLast();

    @Override
    Object getFirst();

    @Override
    Object getLast();

    @Override
    Object peekFirst();

    @Override
    Object peekLast();

    @Override
    boolean removeFirstOccurrence(Object o);

    @Override
    boolean removeLastOccurrence(Object o);

    @Override
    boolean add(Object o);

    @Override
    boolean offer(Object o);

    @Override
    Object remove();

    @Override
    Object poll();

    @Override
    Object element();

    @Override
    Object peek();

    @Override
    boolean addAll(Collection c);

    @Override
    void push(Object o);

    @Override
    Object pop();

    @Override
    boolean remove(Object o);

    @Override
    boolean contains(Object o);

    @Override
    int size();

    @Override
    Iterator iterator();

    @Override
    Iterator descendingIterator();
}
