package collections;

import java.util.Stack;

public class OldStackExample {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Print the stack
        System.out.println("Stack: " + stack);

        // Pop elements from the stack
        int element1 = stack.pop();
        int element2 = stack.pop();

        // Print the popped elements
        System.out.println("Popped elements: " + element1 + ", " + element2);

        // Get the top element without removing it
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);

        // Get the size of the stack
        int size = stack.size();
        System.out.println("Stack size: " + size);
    }
}
