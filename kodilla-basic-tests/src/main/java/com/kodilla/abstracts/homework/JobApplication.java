package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {

        Person cook = new Person("John", 30, new Cook());
        Person teacher = new Person("Alex", 50, new Teacher());
        Person painter = new Person("Emily", 40, new Painter());
        showJobsResponsibilities(cook);
        showJobsResponsibilities(teacher);
        showJobsResponsibilities(painter);
    }

    private static void showJobsResponsibilities(Person person) {
        person.showResponsibilities();
    }


}

