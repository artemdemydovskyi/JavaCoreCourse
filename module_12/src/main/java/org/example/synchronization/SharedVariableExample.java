package org.example.synchronization;

public class SharedVariableExample {
    private static int sharedVariable = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new IncrementRunnable());
        Thread thread2 = new Thread(new DecrementRunnable());

        thread1.start();
        thread2.start();
    }

    static class IncrementRunnable implements Runnable {
        public void run() {
            synchronized (SharedVariableExample.class) {
                sharedVariable++;
                System.out.println("Incremented: " + sharedVariable);
            }
        }
    }

    static class DecrementRunnable implements Runnable {
        public void run() {
            synchronized (SharedVariableExample.class) {
                sharedVariable--;
                System.out.println("Decremented: " + sharedVariable);
            }
        }
    }
}
