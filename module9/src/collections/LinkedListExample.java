package collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a new LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Add an element at the beginning of the LinkedList
        linkedList.addFirst("Orange");

        // Add an element at the end of the LinkedList
        linkedList.addLast("Grapes");

        // Insert an element at a specific position in the LinkedList
        linkedList.add(2, "Mango");

        // Remove an element from the LinkedList
        linkedList.remove("Cherry");

        // Get the first and last elements of the LinkedList
        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();

        // Print the elements of the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Print the first and last elements
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Iterate over the LinkedList using a for-each loop
        System.out.println("Elements using for-each loop:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
