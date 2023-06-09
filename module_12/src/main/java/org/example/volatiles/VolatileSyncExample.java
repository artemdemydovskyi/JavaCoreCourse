package org.example.volatiles;

public class VolatileSyncExample {
    private volatile static int counter = 0;

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            synchronized (VolatileSyncExample.class) {
                for (int i = 0; i < 1000; i++) {
                    counter++;
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (VolatileSyncExample.class) {
                for (int i = 0; i < 1000; i++) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    counter++;
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Counter Value: " + counter);
    }

}
