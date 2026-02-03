import java.util.Scanner;
import javax.naming.spi.DirStateFactory.Result;

class Assignment2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = null;

        try {

            System.out.println("Enter Array Size");
            int size = sc.nextInt();

            if (size == 0) {
                arr = null; // forces NullPointerException
            } else {
                arr = new int[5]; // valid array
            }
            System.out.println(" value of index" + size + "is:" + arr[size]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" array size exceeds the index size");
        } catch (NullPointerException e) {

            System.out.println(" entered value is 0, which is not acceptable");
        } finally {
            sc.close();
            System.out.println("displaying message");
        }
    }
}