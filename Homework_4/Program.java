package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class Program {

    /*
    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    c. Для хранения фруктов внутри коробки можно использовать ArrayList;
    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
    подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
    Можно сравнивать коробки с яблоками и апельсинами;
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    g. Не забываем про метод добавления фрукта в коробку.

    Формат сдачи: ссылка на гитхаб проект
        * */
    public static void main(String[] args) {

        Box<Apple> box1 = new Box<>(
                new Apple(),
                new Apple(),
                new Apple(),
                new Apple(),
                new Apple()
        );
        Box<Apple> box2 = new Box<>();
        for (int i = 0; i < 300; i++) {
            box2.add(new Apple());
        }
        Box<Orange> box3 = new Box<>(
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange()
        );
        Box<Orange> box4 = new Box<>();
        for (int i = 0; i < 250; i++) {
            box4.add(new Orange());


        }
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box3.getWeight());
        System.out.println(box4.getWeight());
        System.out.println();

        System.out.println(box1.compare(box3));


        box1.replaceAll(box2);

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());


    }

}
