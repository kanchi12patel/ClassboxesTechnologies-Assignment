import java.util.Scanner;

// Custom Exception
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class Assignment8 {

    public static void main(String[] args) throws MyException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password length:");
        int passlen = sc.nextInt(); // correct usage

        try {
            if (passlen < 8) {
                throw new MyException("Password length is smaller than 8, that is invalid");
            } else {
                System.out.println("Password length is valid");
            }
        } catch (MyException e) {
            // Print the exception message
            System.out.println("Exception error occurs: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Program executed successfully");
        }
    }
}