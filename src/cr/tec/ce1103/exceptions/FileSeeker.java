package cr.tec.ce1103.exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileSeeker {
    public static void main (String[] args) {
        try {
            test();
        }
        catch (IOException e) {
            Logger.getLogger(FileSeeker.class.getName()).log(Level.SEVERE, (String) null);
            System.out.println("Error ✘✘✘");
            System.out.println("Your request couldn't be processed");
        }
        finally {
            System.out.println("✔");
        }
    }

    public static void test() throws IOException {
        FileReader reader = new FileReader("test");
    }
}
