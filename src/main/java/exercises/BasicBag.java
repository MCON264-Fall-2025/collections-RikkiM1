package exercises;

import edu.touro.mcon264.apps.collections.ArrayCollection;
import edu.touro.mcon264.apps.collections.BagInterface;
import java.util.Random;



public class BasicBag<T> extends ArrayCollection<T> implements BagInterface<T> {
    private Random rand = new Random();
    /**
     * Returns a random element from the bag.
     * If the bag is empty, returns null.
     *
     * @return a randomly selected element, or null if empty
     */
    @Override
    public T grab() {
        if (size() == 0) {
            return null;
        }
        int index = rand.nextInt(size()); // pick random index
        return elements[index];         // return element at that index
    }
    /**
     * Counts the number of times the target element appears in the bag.
     *
     * @param target the element to search for
     * @return the number of occurrences of target
     */
    @Override
    public int count(T target) {
        int count = 0;
        for (int i = 0; i < size(); i++) {
            if (elements[i].equals(target)) {
                count++;
            }
        }
        return count;
    }
    /**
     * Removes all occurrences of the target element from the bag.
     *
     * @param target the element to remove
     * @return the number of elements removed
     */
    @Override
    public int removeAll(T target) {
        int removed = 0;
        int i = 0;
        int size = size();
        while (i < size()) {
            if (elements[i].equals(target)) {
                // shift elements left
                for (int j = i; j < size() - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                elements[size() - 1] = null; // clear last slot
                size--;
                removed++;
            } else {
                i++; // only advance if no removal
            }
        }
        return removed;
    }
    /**
     * Removes all elements from the bag.
     */
    @Override
    public void clear() {
        int size = size();
        for (int i = 0; i < size(); i++) {
            elements[i] = null;
        }
        size = 0;
    }

    // TODO: implement the methods in the BagInterface using an array as the underlying data structure
    // consider extending ArrayCollection<T>
    // put in the JavaDoc comments as specified in the BagInterface.
    // Which SOLID principles is being applied here?


}
