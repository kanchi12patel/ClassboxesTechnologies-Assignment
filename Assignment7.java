
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class Assignment7 {

    public static void main(String arg[]) {

        String fileName = " sample.txt";

        try (

                BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {

            System.out.println(" error message" + e.getMessage());
            e.printStackTrace();

        }

    }
}