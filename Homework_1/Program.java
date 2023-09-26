import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Product product1 = new Product("ООО Источник", "_", -100);
        Product product2 = new Product();
        System.out.println(product2.displayInfo());
        Product product3 = new Product("Бутылка с водой (3)", 50);
        System.out.println(product3.displayInfo());
        Product bottleOfMilk1 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (1)", 150, 2, 15);
        System.out.println(bottleOfMilk1.displayInfo());
        Product bottleOfWater1 = new BottleOfWater("ООО Источник", "Бутылка с водой (5)", 150, 2, 15);
        Product bottleOfMilk2 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (2)", 110, 1, 15);
        Product bottleOfMilk3 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (3)", 160, 2, 25);
        Product bottleOfMilk4 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (4)", 170, 3, 35);
        Product BottleOfSoda1 = new BottleOfSoda("Светлоголовка","Лимонад",100,"Лимон");
        Product BottleOfSoda2 = new BottleOfSoda("Светлоголовка","Дюшес",100,"Груша");
        Product BottleOfSoda3 = new BottleOfSoda("Светлоголовка","Кузнечик",100,"Лайм");
        Product BottleOfSoda4 = new BottleOfSoda("Светлоголовка","Буратино",100,"Детсва");

        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(bottleOfMilk1);
        arrayList.add(bottleOfWater1);
        arrayList.add(bottleOfMilk2);
        arrayList.add(bottleOfMilk3);
        arrayList.add(bottleOfMilk4);

        ArrayList<Product> arrayList1 = new ArrayList<>();
        arrayList1.add(BottleOfSoda1);
        arrayList1.add(BottleOfSoda2);
        arrayList1.add(BottleOfSoda3);
        arrayList1.add(BottleOfSoda4);

        VendingMachine vendingMachine = new VendingMachine(arrayList1);

    BottleOfSoda bottleOfSoda = vendingMachine.getBottleOfSoda("Кузнечик", "Лайм");
        if (bottleOfSoda != null){
                System.out.println("Вы купили:");
                System.out.println(bottleOfSoda.displayInfo());
                }
                else {
                System.out.println("Такой бутылки с газировкой нет в автомате.");
                }

                }

                }