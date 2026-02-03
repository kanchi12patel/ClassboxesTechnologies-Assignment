
import java.io.*;

class Assignment4 {

    public static void main(String arg[]) throws FileNotFoundException {
        FileReader fileReader = new FileReader("example.txt");

        try {

            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {

            System.out.println("error encountered ");
        } finally {

            System.out.println(" The assignment completed successfully");
        }

    }
}