//Aim- Create a program to use lambda expressions and stream operations to filter students scoring above 75%, sort them by marks, and display their names

import java.util.*;
import java.util.stream.Collectors;
class Student {
    String name;
    double marks;
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class StudentFilterSort {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 78),
            new Student("Bob", 65),
            new Student("Charlie", 82),
            new Student("David", 74),
            new Student("Eve", 90)
        );
        List<String> topStudents = students.stream()
            .filter(s -> s.marks > 75)
            .sorted(Comparator.comparingDouble(s -> s.marks))
            .map(s -> s.name)
            .collect(Collectors.toList());
        System.out.println("Students scoring above 75% (sorted by marks): " + topStudents);
    }
}
