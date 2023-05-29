package org.example.bytearray;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {
        // Create a new ByteArrayOutputStream
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        // Write data to the ByteArrayOutputStream
        String data = "Hello, world!";
        try {
            byteArrayOutputStream.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Get the written data as a byte array

        // Display the written data
        String output = byteArrayOutputStream.toString();
        System.out.println("Written data: " + output);

//        try {
//            byteArrayOutputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
