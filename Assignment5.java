
import java.util.Scanner;
import java.lang.Exception;

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {

        super(message);
    }
}

class Assignment5 {

    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the amount");
        int amount = scanner.nextInt();
        System.out.println(" Enter the balance");
        int balance = scanner.nextInt();

        try {
            if (amount > balance || balance < 0)
                throw new InsufficientBalanceException(" it is not valid");
            else {
                System.out.println(" amount deposited successfully");
            }
        } catch (InsufficientBalanceException e) {
            System.out.println("balance can never be negative or less then withdrawal amount" + e);
        }

        finally {

            scanner.close();
            System.out.println(" assignment completed successfully");
        }

    }
}