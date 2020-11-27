package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp(true, "ptaki", 5,3));
        stamps.add(new Stamp(true, "królowie", 3, 2));
        stamps.add(new Stamp(true, "Stolica", 4, 2));
        stamps.add(new Stamp(true, "ptaki", 5,3));

        System.out.println(stamps.size());
        for (Stamp stamp :stamps){
            System.out.println(stamp);
        }
    }
}
