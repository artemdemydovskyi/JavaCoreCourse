package collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        // Enqueue elements
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        // Dequeue elements
        String element = queue.remove();
        System.out.println("Removed element: " + element);  // Output: Removed element: Element 1

        // Access the front of the queue without removing it
        String front = queue.peek();
        System.out.println("Front of the queue: " + front);  // Output: Front of the queue: Element 2
    }
}
