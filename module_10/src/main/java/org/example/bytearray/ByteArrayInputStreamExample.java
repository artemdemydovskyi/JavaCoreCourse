package org.example.bytearray;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Example of using ByteArrayInputStream.
 */
public class ByteArrayInputStreamExample {

    /**
     * Main method to demonstrate the usage of ByteArrayInputStream.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        // Input data byte array
        byte[] data = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};

        // Create a ByteArrayInputStream with the byte array
        InputStream inputStream = new ByteArrayInputStream(data);

        try {
            int byteValue;
            while ((byteValue = inputStream.read()) != -1) {
                // Convert byte value to character and print it
                char character = (char) byteValue;
                System.out.print(character);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the input stream
            try {
                inputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
