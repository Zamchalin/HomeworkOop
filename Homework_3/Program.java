package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();

    static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(50000, 120000);
        int age = random.nextInt(23, 60);
        Worker worker = new Worker(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary, age);
        return worker;
    }

    static Freelancer generateFreelancer(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int kef = random.nextInt(2000, 5001);
        int salary = (int) (20.8 * 8 * kef);
        int age = random.nextInt(23, 60);
        Freelancer freelancer = new Freelancer(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary, age);
        return freelancer;
    }

    /**
     * TODO: Метод generateEmployees должен быть универсальным, возвращать некоторое кол-во
     *  сотрудников различных типов
     *
     * @param count
     * @return
     */

    static Employee[] generateEmployees(int count){
        Employee[] array = new Employee[count];

        for (int i = 0; i < array.length; i++){
            int k = random.nextInt(0, 2);
            if(k==1) {
                array[i] = generateFreelancer();
            }else{
                array[i] = generateWorker();
            }

        }

        return array;
    }
    public static void main(String[] args) {



        Employee[] employees = generateEmployees(10);

        Arrays.sort(employees, new SalaryComparator(SortType.Ascending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }


    }

}
