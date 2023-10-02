import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("pushok",25);
        Plate plate1 = new Plate(20);

        if(cat1.getAppetite() > plate1.getFood()) {
            System.out.println("Котику слишком мало еды, сколько еды вы хотите добавить?");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            plate1.setFood(plate1.getFood() + num);
            if(cat1.getAppetite() > plate1.getFood()){
                System.out.println("Котик так и остался голодным, сходите за кормом(!");
            }else{
                System.out.println("Теперь котик наелся и идёт спать!");
            }


        } else {
            System.out.println("Котик накушался");
        }




    }
}
