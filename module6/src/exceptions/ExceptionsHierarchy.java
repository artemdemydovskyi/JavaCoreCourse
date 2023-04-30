package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsHierarchy {
    public void readFromFile(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        } catch (IOException e) {
            System.err.println("Error reading file: " + filename);
        } catch (Exception e) {
            System.err.println("Unexpected exception: " + e.getMessage());
        }
    }

}
