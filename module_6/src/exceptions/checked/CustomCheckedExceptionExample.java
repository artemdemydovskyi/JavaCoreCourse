package exceptions.checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CustomCheckedExceptionExample {

    public static String readFile(String fileName) throws IncorrectFileNameException {
        try (Scanner file = new Scanner(new File(fileName))) {
            if (file.hasNextLine())
                return file.nextLine();
        } catch (FileNotFoundException e) {
            if (!isCorrectFileName(fileName)) {
                throw new IncorrectFileNameException("Incorrect filename : " + fileName);
            }
        }
        return "Something";
    }

    public static boolean isCorrectFileName(String fileName) {
        return true;
    }
}
