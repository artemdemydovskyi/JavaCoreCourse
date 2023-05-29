package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        List<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Accessing elements in the ArrayList
        System.out.println("Elements in the ArrayList: " + numbers);

        // Accessing a specific element by index
        int firstElement = numbers.get(0);
        System.out.println("First element: " + firstElement);

        // Modifying an element at a specific index
        numbers.set(1, 25);
        System.out.println("Modified ArrayList: " + numbers);

        // Removing an element from the ArrayList
        numbers.remove(2);
        System.out.println("ArrayList after removal: " + numbers);

        // Checking if an element exists in the ArrayList
        boolean containsElement = numbers.contains(40);
        System.out.println("ArrayList contains 40: " + containsElement);

        // Getting the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of the ArrayList: " + size);

        // Iterating over the elements of the ArrayList
        System.out.println("Iterating over the ArrayList:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Clearing the ArrayList
        numbers.clear();
        System.out.println("ArrayList after clearing: " + numbers);
    }
}
