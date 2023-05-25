package org.example.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String fileName = "module10/src/main/java/org/example/file/example.txt"; // Name of the file

        // Write data to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            String data = "Hello, World!";
            writer.write(data);
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read data from the file
        try (FileReader reader = new FileReader(fileName)) {
            char[] buffer = new char[1024];
            int bytesRead = reader.read(buffer);
            String data = new String(buffer, 0, bytesRead);
            System.out.println("Data read from the file: " + data);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
