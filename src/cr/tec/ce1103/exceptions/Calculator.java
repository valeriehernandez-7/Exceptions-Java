package cr.tec.ce1103.exceptions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try{
            int num1, num2;
            float result;
            Scanner entry = new Scanner(System.in);

            System.out.println("Enter dividend ➤");
            num1 = entry.nextInt();

            System.out.println("Enter divisor ➤");
            num2 = entry.nextInt();

            result = num1/num2;
            System.out.println("Quotient obtained ➤ " + result);
        }
        catch(Exception e){
            System.out.println("Can't be solve! Try again!");
            System.out.println("Error!" + e);
        }
        finally {
            System.out.println("✔");
        }
    }
}
