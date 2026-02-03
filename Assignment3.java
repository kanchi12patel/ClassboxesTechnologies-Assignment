import java.util.Scanner;

class MyException extends Exception {

    public MyException(String message) {

        super(message);

    }

}

class Assignment3 {

    /**
     * @param arg
     */
    public static void main(String arg[]) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = reader.nextInt();

        try {

            if (age < 18)
                throw new MyException(" age is not valid for voting");
            else {
                System.out.println(" age is eligible for voting");
            }

        } catch (MyException e) {

            System.out.println(" the expection is" + e);
        } finally {
            System.out.println(" program executed finally");

        }

    }
}