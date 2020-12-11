package com.kodilla.exception;

public class FirstExample {
    public static void main(String[] args) {
        String userName = "Will";
        String [] nameParts = userName.split(" ");
        System.out.println("First name: " + nameParts[0]);
        System.out.println("First name: " + nameParts[1]);
    }
}
