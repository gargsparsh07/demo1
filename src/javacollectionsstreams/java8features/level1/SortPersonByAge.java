package javacollectionsstreams.java8features.level1;

import java.util.*;

class PersonAge {
    String name;
    int age;
    double salary;

    PersonAge(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class SortPersonByAge {

    public static void main(String[] args) {
        List<PersonAge> people = new ArrayList<>();
        people.add(new PersonAge("John", 30, 50000));
        people.add(new PersonAge("Alice", 25, 60000));
        people.add(new PersonAge("Bob", 35, 55000));

        people.sort((p1, p2) -> p1.age - p2.age);

        people.forEach(p ->
                System.out.println(p.name + " - " + p.age)
        );
    }
}
