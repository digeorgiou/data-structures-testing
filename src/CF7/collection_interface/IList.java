package CF7.collection_interface;

import java.util.*;
import java.util.function.UnaryOperator;

/**
 * Το ArrayList και το LinkedList ειναι οι πιο δημοφιλεις
 * υλοποιησεις του interface List
 */

public interface IList extends List {

    @Override
    int size();

    @Override
    boolean isEmpty();

    @Override
    boolean contains(Object o);

    @Override
    Iterator iterator();

    @Override
    Object[] toArray();

    @Override
    Object[] toArray(Object[] a);

    @Override
    boolean add(Object o);

    @Override
    boolean remove(Object o);

    @Override
    boolean containsAll(Collection c);

    @Override
    boolean addAll(Collection c);

    @Override
    boolean addAll(int index, Collection c);

    @Override
    boolean removeAll(Collection c);

    @Override
    boolean retainAll(Collection c);

    @Override
    default void replaceAll(UnaryOperator operator) {
        List.super.replaceAll(operator);
    }

    @Override
    default void sort(Comparator c) {
        List.super.sort(c);
    }

    @Override
    void clear();

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();

    @Override
    Object get(int index);

    @Override
    Object set(int index, Object element);

    @Override
    void add(int index, Object element);

    @Override
    Object remove(int index);

    @Override
    int indexOf(Object o);

    @Override
    int lastIndexOf(Object o);

    @Override
    ListIterator listIterator();

    @Override
    ListIterator listIterator(int index);

    @Override
    List subList(int fromIndex, int toIndex);

    @Override
    default Spliterator spliterator() {
        return List.super.spliterator();
    }
}
