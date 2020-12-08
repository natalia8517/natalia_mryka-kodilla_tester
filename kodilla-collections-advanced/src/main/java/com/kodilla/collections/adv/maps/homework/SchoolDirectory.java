package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolBoard = new HashMap<>();

        schoolBoard.put(new Principal("John Smith"), new School("School 1", 30, 28, 21, 29));
        schoolBoard.put(new Principal("Emily Jones"), new School("School 2", 31, 28, 30, 25));
        schoolBoard.put(new Principal("Will Watson"), new School("School 3", 34, 28, 32, 30));

        for (Map.Entry<Principal, School> schoolBoardEntry : schoolBoard.entrySet()) {
            System.out.println("Principal " + schoolBoardEntry.getKey().getPrincipalName() + "\nSchool name " + schoolBoardEntry.getValue().getName() + " \nTotal num of students " + schoolBoardEntry.getValue().totalNumberOfStudents());
        }
    }
}
