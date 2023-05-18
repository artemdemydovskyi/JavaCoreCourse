package collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeueExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        // Enqueue elements
        deque.add("Element 1");
        deque.add("Element 2");
        deque.add("Element 3");

        // Dequeue an element
        String dequeuedElement = deque.remove();
        System.out.println("Dequeued element: " + dequeuedElement);  // Output: Dequeued element: Element 1

        // Get the new front and end elements
        String frontElement = deque.peek();
        String endElement = deque.getLast();
        System.out.println("Front element: " + frontElement);  // Output: Front element: Element 2
        System.out.println("End element: " + endElement);  // Output: End element: Element 3
    }
}
