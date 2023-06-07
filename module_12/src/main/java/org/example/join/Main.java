package org.example.join;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Printer printer1 = new Printer("Pedro Pascal");
        Thread thread1 = new Thread(printer1);
        thread1.start();
        thread1.join();
        System.out.println("HELLO");
    }
}

