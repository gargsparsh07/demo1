package javacollectionsstreams.java8features.level2;

import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name, department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeDataProcessing {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1,"Alice","Engineering",90000),
                new Employee(2,"Bob","Engineering",85000),
                new Employee(3,"Charlie","HR",70000),
                new Employee(4,"David","Engineering",95000)
        );

        Map<String, Double> avgSalary =
                employees.stream()
                        .filter(e -> e.department.equals("Engineering") && e.salary > 80000)
                        .sorted((a,b)->Double.compare(b.salary,a.salary))
                        .collect(Collectors.groupingBy(
                                e->e.department,
                                Collectors.averagingDouble(e->e.salary)
                        ));

        System.out.println(avgSalary);
    }
}
