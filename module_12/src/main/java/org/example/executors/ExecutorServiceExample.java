package org.example.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            executor.submit(() -> {
                long threadId = Thread.currentThread().getId();
                System.out.println("Задача " + taskId + " розпочата в потоці " + threadId);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Задача " + taskId + " виконана в потоці " + threadId);
            });
        }

        executor.shutdown();
    }
}
