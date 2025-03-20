//Aim - Write a program to sort a list of Employee objects (name, age, salary) using lambda expressions.   
import java.util.*;
class Employee {
    String name;
    int age;
    double salary;
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}
public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 50000));
        employees.add(new Employee("Bob", 25, 60000));
        employees.add(new Employee("Charlie", 35, 55000));
        employees.sort(Comparator.comparing(emp -> emp.name));
        System.out.println("Sorted by name: " + employees);
        employees.sort(Comparator.comparingInt(emp -> emp.age));
        System.out.println("Sorted by age: " + employees);
        employees.sort(Comparator.comparingDouble(emp -> emp.salary));
        System.out.println("Sorted by salary: " + employees);
    }
}
