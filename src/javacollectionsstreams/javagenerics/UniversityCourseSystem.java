package javacollectionsstreams.javagenerics;

import java.util.*;

// Base course
abstract class CourseType {
    String name;

    CourseType(String name) {
        this.name = name;
    }
}

// Course types
class ExamCourse extends CourseType {
    ExamCourse(String name) {
        super(name);
    }
}

// Generic Course manager
class Course<T extends CourseType> {
    List<T> courses = new ArrayList<>();

    void addCourse(T course) {
        courses.add(course);
    }
}

// Main class
public class UniversityCourseSystem {
    public static void main(String[] args) {

        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Data Structures"));
        examCourses.addCourse(new ExamCourse("Algorithms"));

        for (CourseType c : examCourses.courses) {
            System.out.println(c.name);
        }
    }
}
