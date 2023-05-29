package org.example.folder;

import java.io.File;

public class NestedFoldersExample {
    public static void main(String[] args) {
        // Create a new File object for the nested folders
        File folders = new File("module10/src/main/java/org/example/folder/parent/child/grandchild");

        // Check if the folders exist
        boolean exists = folders.exists();
        System.out.println("Folders exist: " + exists);

        if (!exists) {
            // Create the nested folders
            boolean created = folders.mkdir();
            System.out.println("Folders created: " + created);
        }

        // Get folders information
        System.out.println("Folders name: " + folders.getName());
        System.out.println("Absolute path: " + folders.getAbsolutePath());
    }
}
