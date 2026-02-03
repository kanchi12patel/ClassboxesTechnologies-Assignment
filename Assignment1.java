import java.util.InputMismatchException;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Assignment1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("print numerator");
            int numerator = sc.nextInt();

            System.out.println("print denominator");
            int denominator = sc.nextInt();

            int result = numerator / denominator;
            System.out.println("Result" + result);
        }

        catch (ArithmeticException e) {
            System.out.println("It is arithmetic exception");

        } catch (InputMismatchException e) {
            System.out.println("It is InputMismatchException");
        } finally {
            sc.close();
            System.out.println("Print a friendly message ");
        }

    }
}
