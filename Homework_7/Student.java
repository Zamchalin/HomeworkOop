package ru.geekbrains.lesson7.observer;

import java.util.Objects;

public class Student implements Observer{

    private String name;
    private int salary = 2000;
    private String vacancy = "Стажёр";


    public Student(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, String vacancy) {
        if (this.salary <= salary && Objects.equals(vacancy, "Стажёр")){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s;вакансия: %s;заработная плата: %d)\n",
                    name, nameCompany,vacancy, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s;вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
        }
    }


}
