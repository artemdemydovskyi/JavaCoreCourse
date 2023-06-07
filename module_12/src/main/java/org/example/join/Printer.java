package org.example.join;

class Printer implements Runnable {
    private final String name;

    public Printer(String name) {
        this.name = name;
    }
    public void run() {
        System.out.println("Your nickname is " + this.name);
    }
}