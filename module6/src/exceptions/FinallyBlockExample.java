package exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class FinallyBlockExample {
    public void someMethod() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("somefile.txt");
            // do some file processing
        } catch (IOException e) {
            System.err.println("Error reading file");
        } finally {
            // close the file input stream regardless of whether an exception was thrown or not
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing file");
            }
        }
    }

}
