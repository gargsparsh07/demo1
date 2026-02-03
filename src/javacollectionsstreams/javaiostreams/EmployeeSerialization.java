package javacollectionsstreams.javaiostreams;

import java.io.*;
import java.util.*;

class Employee implements Serializable {
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

public class EmployeeSerialization {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Amit", "IT", 70000));
        employees.add(new Employee(2, "Riya", "HR", 50000));

        // Serialize
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("employees.ser"))) {
            oos.writeObject(employees);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("employees.ser"))) {

            List<Employee> list = (List<Employee>) ois.readObject();
            for (Employee e : list) {
                System.out.println(e.id + " " + e.name + " " + e.department + " " + e.salary);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
