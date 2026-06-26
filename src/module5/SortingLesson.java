package module5;

import models.Student;

import java.util.ArrayList;
import java.util.List;

public class SortingLesson {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(110L, "Rajat", "4", 78));
        students.add(new Student(119L, "Sujal", "8", 56));
        students.add(new Student(921L, "Zuber", "10", 47));
        students.add(new Student(392L, "Rupesh", "2", 97));


        System.out.println(students);
    }
}
