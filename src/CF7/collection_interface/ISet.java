package CF7.collection_interface;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

/**
 * Το Set περιλαμβανει στοιχεια (σαν κουβας) που δεν επαναλαμβανονται.
 * αν προστεθει στοιχειο που ηδη υπαρχει, αυτο συνεχιζει να υπαρχει μια φορα
 * μεσα στο Set.
 * Τα Set ελεγχουν τα διπλοτυπα με την equals. αρα αν θελουμε να βαλουμε
 * δικες μας κλασεις σε Set πρεπει να κανουμε override την equals.
 *
 * Η πιο δημοφιλης υλοποιηση του interface Set ειναι το HashSet
 * εδω τα διπλοτυπα ελεγχονται με την hashCode. αρα πρεπει να την υπερκαλυψουμε
 * κι αυτην σε δικες μας κλασεις, για να μπορουν να μπουν σε HashSet
 */

public interface ISet extends Set {

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
    boolean retainAll(Collection c);

    @Override
    boolean removeAll(Collection c);

    @Override
    void clear();

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();

    @Override
    default Spliterator spliterator() {
        return Set.super.spliterator();
    }
}
