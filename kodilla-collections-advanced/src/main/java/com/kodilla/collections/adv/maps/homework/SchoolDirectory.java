package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolBoard = new HashMap<>();

        School school1 = new School("School 1", 30, 28, 21, 29);
        School school2 = new School("School 2", 31, 28, 30, 25);
        School school3 = new School("School 3", 34, 28, 32, 30);

        Principal johnS = new Principal("John Smith");
        Principal emilyJ = new Principal("Emily Jones");
        Principal willW = new Principal("Will Watson");

        schoolBoard.put(johnS, school1);
        schoolBoard.put(emilyJ, school2);
        schoolBoard.put(willW, school3);

        for (Map.Entry<Principal, School> schoolBoardEntry : schoolBoard.entrySet()) {
            System.out.println("Principal " + schoolBoardEntry.getKey().getPrincipalName() + "\nSchool name " + schoolBoardEntry.getValue().getName() + " \nTotal num of students " + schoolBoardEntry.getValue().totalNumberOfStudents());
        }
    }
}
