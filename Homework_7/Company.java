package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;

    private int maxSalary;
    private String vacancy;

    private Publisher jobAgency;


    public Company(String name, Publisher jobAgency, int maxSalary, String vacancy) {
        this.name = name;
        this.maxSalary = maxSalary;
        this.vacancy = vacancy;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary, vacancy);
    }

}
