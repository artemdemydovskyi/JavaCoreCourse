package org.example;

public class ThreadExample{
    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("The app has been started");
        }
    }

    public static void main(String []args){
        Thread thread = new MyThread();
        thread.run();
        System.out.println();
    }
}