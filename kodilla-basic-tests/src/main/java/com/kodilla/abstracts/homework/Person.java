package com.kodilla.abstracts.homework;

public class Person {

    String firstName;
    int age;
    Job job;

    public Person(String firstName, int age, Job job)
    {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public void showResponsibilities(){
        System.out.println( this.firstName + "; " + this.age + " years;  responsibilities: " + job.getResponsibilities());
    }
}
