package collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a new HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grape");
        set.add("Apple"); // Adding duplicate element, which will be ignored

        // Print the elements in the set
        System.out.println("HashSet Elements: " + set);

        // Check if the set contains a specific element
        boolean containsBanana = set.contains("Banana");
        System.out.println("Contains 'Banana': " + containsBanana);

        // Remove an element from the set
        boolean removedOrange = set.remove("Orange");
        System.out.println("Removed 'Orange': " + removedOrange);

        // Print the updated set
        System.out.println("Updated HashSet Elements: " + set);

        // Get the size of the set
        int setSize = set.size();
        System.out.println("Set Size: " + setSize);

        // Clear the set
        set.clear();
        System.out.println("Cleared HashSet Elements: " + set);

        // Check if the set is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is HashSet Empty? " + isEmpty);
    }
}
