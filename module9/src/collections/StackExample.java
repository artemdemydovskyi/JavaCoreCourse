package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {
    public static void main(String[] args) {
        // Creating a stack using ArrayDeque
        Deque<Integer> stack = new ArrayDeque<>();

        // Pushing elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Stack elements: " + stack);  // Output: Stack elements: [4, 3, 2, 1]

        // Popping elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);  // Output: Popped element: 4

        System.out.println("Updated stack elements: " + stack);  // Output: Updated stack elements: [3, 2, 1]

        // Peeking the top element of the stack
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);  // Output: Top element: 3
    }
}
