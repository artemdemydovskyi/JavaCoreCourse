package org.example.waiting;

public class SimpleWaitNotifyDemo {
    private static String message;

    public static void main (String[] args) {
        Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                while (message == null) {
                    try {
                        System.out.println("LOCK WAIT");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            System.out.println(message);
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("LOCK_NOTIFY");
                message = "A message from thread1";
                lock.notify();
            }
        });

        thread1.setPriority(1);
        thread2.setPriority(10);
        thread2.start();
        thread1.start();
    }
}