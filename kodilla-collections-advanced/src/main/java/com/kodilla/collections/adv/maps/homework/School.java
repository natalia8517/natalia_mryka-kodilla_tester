package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    List<Integer> students = new ArrayList<>();
    String name;

    public String getName() {
        return name;
    }

    public School(String name, int... students) {
        this.name = name;
        for (int num : students)
            this.students.add(num);
    }

    public int totalNumberOfStudents() {
        int totalNum = 0;
        for (int num : students) {
            totalNum += num;
        }
        return totalNum;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                ", name='" + name + '\'' +
                '}';
    }
}
