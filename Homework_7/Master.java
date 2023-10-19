package ru.geekbrains.lesson7.observer;

import java.util.Objects;

public class Master implements Observer{

    private String name;
    private int salary = 80000;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, String vacancy) {
        if (this.salary <= salary  && Objects.equals(vacancy, "Програмист")){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s;вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany,vacancy, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s;вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany,vacancy,salary);
        }
    }
}
