public class BagRunner {
    public static void main(String[] args) {
        Bag<Integer> bag = new Bag<Integer>();

        // Add 1,2,3,4,5 to the bag.
        bag.add(1);
        bag.add(2);
        bag.add(3);
        bag.add(4);
        bag.add(5);

        // Clear the bag.
        bag.clear();

        // Add 6,7,8,9,10 to the bag.
        bag.add(6);
        bag.add(7);
        bag.add(8);
        bag.add(9);
        bag.add(10);

        // Check if the bag contains 8 and 100.
        System.out.println("Contains 8: " + bag.contains(8));
        System.out.println("Contains 100: " + bag.contains(11));

        // Grab a random element from the bag.
        System.out.println("Grab a random element: " + bag.grab());

        // Check if the bag is empty.
        System.out.println("The bag is empty: " + bag.isEmpty());

        // Remove 8 and 100 from the bag.
        System.out.println("Remove 8 from the bag: " + bag.remove(8));
        System.out.println("Remove 100 from the bag: " + bag.remove(100));

        //  Print out the number of elements.
        System.out.println("The number of elements in the bag: " + bag.size());

        // Return an array with all the elements in the bag.
        Object[] array = bag.toArray();
        System.out.println("Elements in the bag:" );
        for (Object i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Return an array containing all the elements in ArrayList in the correct order.
        System.out.println("Convert the elements to String: " + bag.toString());
    }
}