package javacollectionsstreams.javagenerics;

import java.util.*;

// Base job role
abstract class JobRole {
    String role;

    JobRole(String role) {
        this.role = role;
    }
}

// Job roles
class SoftwareEngineer extends JobRole {
    SoftwareEngineer() {
        super("Software Engineer");
    }
}

// Generic Resume
class Resume<T extends JobRole> {
    String candidate;
    T role;

    Resume(String candidate, T role) {
        this.candidate = candidate;
        this.role = role;
    }

    void display() {
        System.out.println(candidate + " applying for " + role.role);
    }
}

// Main class
public class ResumeScreeningSystem {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> resume =
                new Resume<>("Sparsh", new SoftwareEngineer());

        resume.display();
    }
}
