import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.Comparator;
import java.util.HashSet;

class StudentManagement {

    static class Student {

        private int id;
        private String name;
        private int age;
        private double marks;

        // Constructor
        public Student(int id, String name, int age, double marks) {

            this.id = id;
            this.name = name;
            this.age = age;
            this.marks = marks;

        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getMarks() {
            return marks;
        }

        @Override
        public String toString() {
            return " student {" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age =" + age +
                    ",marks =" + marks +
                    '}';

        }

    }

    public static void main(String arg[]) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(101, "Sue", 18, 85.5));
        studentList.add(new Student(102, "Bella", 19, 32));
        studentList.add(new Student(103, "Charlie", 18, 78.5));
        studentList.add(new Student(104, "Jacob", 20, 88.0));
        studentList.add(new Student(105, "Seth", 19, 20));

        System.out.println("List of Students:");
        {
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
        boolean hasMarksgreaterthen75 = studentList.stream().anyMatch(s -> s.getMarks() > 75);
        if (hasMarksgreaterthen75) {
            Collections.sort(studentList, Comparator.comparing(Student::getMarks).thenComparing(Student::getMarks));
            studentList.removeIf(student -> student.marks < 40);
            System.out.println(studentList);
        }

        System.out.println("\nUpdated list:");
        studentList.forEach(System.out::println);

        Set<Student> studentSet = new HashSet<>(studentList);

        System.out.println("\nConverted Set:");
        studentSet.forEach(System.out::println);
    }
}