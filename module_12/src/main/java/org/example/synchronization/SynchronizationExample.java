package org.example.synchronization;

public class SynchronizationExample {
    private int count = 0;
    Object object = new Object();
    Object object1 = new Object();

    //Thread A runs sync methodA
    //Thread B runs sync methodB

    private  void synchronizedMethod() {
        synchronized (object1) {
            count++;
            System.out.println("Synchronized Block: Count is " + count);
        }
    }

    private void synchronizedBlock() {
        synchronized (object) {
            count--;
            System.out.println("Synchronized Block: Count is " + count);
        }
    }

    public static void main(String[] args) {
        SynchronizationExample example = new SynchronizationExample();

        // Create multiple threads that call the synchronized method
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                example.synchronizedMethod();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                example.synchronizedMethod();
            }
        });

        // Create multiple threads that call the synchronized block
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                example.synchronizedBlock();
            }
        });

        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                example.synchronizedBlock();
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
