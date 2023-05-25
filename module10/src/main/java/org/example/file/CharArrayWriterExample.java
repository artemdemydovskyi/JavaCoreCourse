package org.example.file;

import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriterExample {
    public static void main(String[] args) {
        // Create a new CharArrayWriter

        // Write data to the CharArrayWriter
        try (CharArrayWriter charArrayWriter = new CharArrayWriter()) {
            String data = "Hello, world!";
            charArrayWriter.write(data);
            char[] charArray = charArrayWriter.toCharArray();

            String output = new String(charArray);
            System.out.println("Written data: " + output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
