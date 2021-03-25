package cr.tec.ce1103.exceptions;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a number between 0-10");

        try {
            int num = input.nextInt();

            if (num < 0 || num > 10) {
                throw new InvalidRequest();
            }
        }
        catch (InvalidRequest e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("✔");
        }
    }
}
