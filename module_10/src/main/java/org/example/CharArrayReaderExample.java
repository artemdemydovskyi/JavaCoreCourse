package org.example;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderExample {
    public static void main(String[] args) {
        // Create a character array
        char[] charArray = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd', '!'};

        // Create a CharArrayReader

        // Read characters from the CharArrayReader
        try (CharArrayReader charArrayReader = new CharArrayReader(charArray)) {
            int character;
            while ((character = charArrayReader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
