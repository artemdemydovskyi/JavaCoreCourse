package collections;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class ArrayDequeVsLinkedListTimeExample {
    public static void main(String[] args) {
        // Using ArrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        long arrayDequeEnqueueStartTime = System.nanoTime();

        // Enqueue elements
        for (int i = 0; i < 1000000; i++) {
            arrayDeque.offer(i);
        }

        long arrayDequeEnqueueEndTime = System.nanoTime();
        long arrayDequeEnqueueTime = arrayDequeEnqueueEndTime - arrayDequeEnqueueStartTime;

        long arrayDequeDequeueStartTime = System.nanoTime();

        // Dequeue elements
        while (!arrayDeque.isEmpty()) {
            arrayDeque.poll();
        }

        long arrayDequeDequeueEndTime = System.nanoTime();
        long arrayDequeDequeueTime = arrayDequeDequeueEndTime - arrayDequeDequeueStartTime;

        System.out.println("ArrayDeque enqueue time: " + arrayDequeEnqueueTime + " nanoseconds");
        System.out.println("ArrayDeque dequeue time: " + arrayDequeDequeueTime + " nanoseconds");


        // Using LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        long linkedListEnqueueStartTime = System.nanoTime();

        // Enqueue elements
        for (int i = 0; i < 1000000; i++) {
            linkedList.offer(i);
        }

        long linkedListEnqueueEndTime = System.nanoTime();
        long linkedListEnqueueTime = linkedListEnqueueEndTime - linkedListEnqueueStartTime;

        long linkedListDequeueStartTime = System.nanoTime();

        // Dequeue elements
        while (!linkedList.isEmpty()) {
            linkedList.poll();
        }

        long linkedListDequeueEndTime = System.nanoTime();
        long linkedListDequeueTime = linkedListDequeueEndTime - linkedListDequeueStartTime;

        System.out.println("LinkedList enqueue time: " + linkedListEnqueueTime + " nanoseconds");
        System.out.println("LinkedList dequeue time: " + linkedListDequeueTime + " nanoseconds");
    }
}
