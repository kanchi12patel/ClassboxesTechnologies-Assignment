import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class Streams {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Kanchi", 85),
                new Student("Jacob", 42),
                new Student("Claire", 95),
                new Student("Embry", 30),
                new Student("Joshua", 70));

        // Find Average Marks
        double average = students.stream()
                .mapToInt(Student::getMarks)
                .average()
                .orElse(0.0);
        System.out.println("Average Marks: " + average);

        // Find Topper (Max Marks)
        Student topper = students.stream()
                .max(Comparator.comparingInt(Student::getMarks))
                .orElse(null);
        System.out.println("Topper: " + topper);

        // Group Pass/Fail Students
        Map<Boolean, List<Student>> passFailGroup = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getMarks() >= 40));
        System.out.println("Passed: " + passFailGroup.get(true));
        System.out.println("Failed: " + passFailGroup.get(false));

        // Sort by Marks Descending & Collect Student Names
        List<String> sortedNames = students.stream()
                .sorted(Comparator.comparingInt(Student::getMarks).reversed())
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println("Names sorted by marks (Desc): " + sortedNames);
    }
}