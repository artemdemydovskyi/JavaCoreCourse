package org.example.systemin;

import java.util.Scanner;

public class SystemInExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        scanner.close();
    }
}
