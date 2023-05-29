package org.example.systemin;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some numbers (enter 'exit' to stop):");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println("Number: " + number);
            } else if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                System.out.println("Number: " + number);
            } else if (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                } else {
                    System.out.println("Invalid input");
                }
            }
        }

        scanner.close();
    }
}
