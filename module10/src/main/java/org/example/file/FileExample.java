package org.example.file;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        // Create a new File object
        File file = new File("module10/src/main/java/org/example/file/example.txt");

        try {
            // Check if the file exists
            boolean exists = file.exists();
            System.out.println("File exists: " + exists);

            if (!exists) {
                // Create a new file
                boolean created = file.createNewFile();
                System.out.println("File created: " + created);
            }

            // Get file information
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("File size: " + file.length() + " bytes");

            // Rename the file
            File renamedFile = new File("module10/src/main/java/org/example/file/new_example.txt");
            boolean renamed = file.renameTo(renamedFile);
            System.out.println("File renamed: " + renamed);

            // Delete the file
//            boolean deleted = renamedFile.delete();
//            System.out.println("File deleted: " + deleted);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
