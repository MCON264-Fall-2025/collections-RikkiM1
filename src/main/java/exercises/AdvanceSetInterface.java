package exercises;

import edu.touro.mcon264.apps.collections.CollectionInterface;

/**
 * Advance Set Interface
 * @param <T>
 */
public interface AdvanceSetInterface <T> extends CollectionInterface<T> {
    /*
     Starter code the exercise 6

     Design signatures for the following methods:
        union()
        intersection()
        difference()
     */

    SetInterface<T> union(SetInterface<T> target);

    SetInterface<T> intersection(SetInterface<T> target);

    SetInterface<T> difference(SetInterface<T> target);
}