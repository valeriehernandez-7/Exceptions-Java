package cr.tec.ce1103.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileBrowser {
    public static void main (String[] args) {
        try {
            FileReader reader = new FileReader("test");
        }
        catch (FileNotFoundException e) {
            System.out.println("Error ✘✘✘");
            System.out.println("File doesn't exist");
        }
        catch (IOException e) {
            System.out.println("Error ✘✘✘");
            System.out.println("Your request couldn't be processed");
        }
        finally {
            System.out.println("✔");
        }
    }
}
