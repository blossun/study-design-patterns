package me.whiteship.designpatterns._01_creational_patterns._05_prototype._03_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student keesun = new Student("keesun");
        Student whiteship = new Student("whiteship");
        List<Student> students = new ArrayList<>();
        students.add(keesun);
        students.add(whiteship);

        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
