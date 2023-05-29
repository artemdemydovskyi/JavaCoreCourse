package org.example.folder;

import java.io.File;

public class FolderExample {
    public static void main(String[] args) {
        // Create a new File object for the folder
        File folder = new File("module10/src/main/java/org/example/folder/example_folder");

        // Check if the folder exists
        boolean exists = folder.exists();
        System.out.println("Folder exists: " + exists);

        if (!exists) {
            // Create a new folder
            boolean created = folder.mkdir();
            System.out.println("Folder created: " + created);
        }

        // Get folder information
        System.out.println("Folder name: " + folder.getName());
        System.out.println("Absolute path: " + folder.getAbsolutePath());
    }
}
