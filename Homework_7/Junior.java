package ru.geekbrains.lesson7.observer;

public class Junior implements Observer{
    private String name;
    private int salary = 50000;
    public Junior(String name) {
        this.name = name;
    }
    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Джуниор %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Джуниор %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }

    }

}
