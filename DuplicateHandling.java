import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.*;

public class DuplicateHandling {

    public static void main(String arg[]) {
        List<String> emailList = new ArrayList<>();
        emailList.add("alice1@example.com");
        emailList.add("sam@example.com");
        emailList.add("claire@example.com");
        emailList.add("jared@example.com");
        emailList.add("alice@example.com"); // Duplicate
        emailList.add("leah@example.com");
        emailList.add("sam@example.com"); // Duplicate

        System.out.println("Original list:" + emailList);

        Set<String> uniqueEmail = new HashSet<>(emailList);
        System.out.println("printing emails uniquely");
        System.out.println(uniqueEmail);

        List<String> sortedEmail = new ArrayList<>(emailList);
        Collections.sort(sortedEmail);
        System.out.println("Sorted emails alphabetically");
        System.out.println(sortedEmail);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(emailList);
        System.out.println("maintaining orders of emails");
        System.out.println(linkedHashSet);

    }

}
