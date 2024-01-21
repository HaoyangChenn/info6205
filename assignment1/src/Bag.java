import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

// Create a Bag class.
public class Bag<T> {
    ArrayList<T> bag;
    Random rand;


    // Initiate an empty bag.
    public Bag() {
        bag = new ArrayList<T>();
        rand = new Random();
    }

    // Add a specific element into a Set collection.
    public void add(T item) {
        bag.add(item);
    }

    // Remove all the elements from a Set.
    public void clear() {
        bag.clear();
    }

    // Search the sequence of characters in the given string.
    public boolean contains(T item) {
        return bag.contains(item);
    }

    // Return a random element in the bag.
    public T grab() {
        if (bag.size() == 0) {
            return null;
        }
        int index = rand.nextInt(bag.size());
        return bag.get(index);
    }

    // Check if the input string is empty or not.
    public boolean isEmpty() {
        return bag.isEmpty();
    }

    // Return true if an object passed as a parameter is removed from the list. Otherwise, return false.
    public boolean remove(T item) {
        return bag.remove(item);
    }

    // Get the number of elements in this list.
    public int size() {
        return bag.size();
    }

    // Return an array with all of the elements in the bag.
    public Object[] toArray() {
        return bag.toArray();
    }

    // Return an array containing all the elements in ArrayList in the correct order.
    public String toString() {
        return bag.toString();
    }
}
