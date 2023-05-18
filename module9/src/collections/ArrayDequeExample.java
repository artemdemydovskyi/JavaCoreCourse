package collections;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Adding elements to the front of the deque
        deque.offerFirst("Element 1");
        deque.offerFirst("Element 2");

        // Adding elements to the end of the deque
        deque.offerLast("Element 3");
        deque.offerLast("Element 4");

        System.out.println("Deque elements: " + deque);  // Output: Deque elements: [Element 2, Element 1, Element 3, Element 4]

        // Removing elements from the front and end of the deque
        String removedFront = deque.pollFirst();
        String removedEnd = deque.pollLast();

        System.out.println("Removed front element: " + removedFront);  // Output: Removed front element: Element 2
        System.out.println("Removed end element: " + removedEnd);  // Output: Removed end element: Element 4

        System.out.println("Updated deque elements: " + deque);  // Output: Updated deque elements: [Element 1, Element 3]
    }
}
