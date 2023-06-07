package org.example;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("The app has been started");

        //an example of the old-fashioned approach
        Runnable task2 = new Runnable() {
            public void run() {
                System.out.println("Hello, World!");
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }
}
