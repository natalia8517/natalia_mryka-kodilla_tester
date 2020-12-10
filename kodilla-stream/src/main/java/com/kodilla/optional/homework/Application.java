package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", new Teacher("James Bond")));
        students.add(new Student("Tom", new Teacher("Tom Hanks")));
        students.add(new Student("Anna", null));
        students.add(new Student("Julia", null));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName = optionalTeacher.orElse(new Teacher("<undefined")).getName();
            System.out.println(teacherName);
        }
    }
}