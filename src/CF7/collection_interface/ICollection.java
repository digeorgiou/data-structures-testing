package CF7.collection_interface;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * εδω ειναι καποιες σημαντικες μεθοδοι που μας δινει το interface Collection
 *
 * Το Collection κληρονομει το Iterable
 * και κληρονομειται απο (List,Set,Queue)
 */
public interface ICollection extends Collection {

    @Override
    int size();

    @Override
    boolean isEmpty();

    @Override
    boolean add(Object o);

    //μπορω να προσθεσω ενα ολοκληρο collection σε ενα αλλο.
    //πχ ενα Set σε μια List
    @Override
    boolean addAll(Collection c);

    @Override
    boolean remove(Object o);

    @Override
    default boolean removeIf(Predicate filter) {
        return Collection.super.removeIf(filter);
    }

    @Override
    default void forEach(Consumer action) {
        Collection.super.forEach(action);
    }

    @Override
    Iterator iterator();

    @Override
    default Stream stream() {
        return Collection.super.stream();
    }
}
