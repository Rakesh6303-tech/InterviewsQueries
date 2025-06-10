package com.company;
import java.util.*;

class Employee {
    int employeeId;
    String firstName, lastName;
    int age;
    double salary;

    public Employee(int employeeId, String firstName, String lastName, int age, double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    // Define getter methods
    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + age;
    }
}

public class Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> employees = new ArrayList<>();

        // Reading input data
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(",");
            employees.add(new Employee(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]), Double.parseDouble(data[4])));
        }
        scanner.close();

        // Fix: Use getter methods
        employees.sort(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getAge));

        // Printing sorted employee list
        employees.forEach(System.out::println);
    }
}
