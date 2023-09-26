import java.util.List;

public class VendingMachine {

    private List<Product> products;


public VendingMachine(List<Product> products){
    this.products = products;
}
    public BottleOfSoda getBottleOfSoda(String name, String taste) {
        for (Product product : products){
            if (product instanceof BottleOfSoda){
                BottleOfSoda bottleOfSoda = (BottleOfSoda)product;
                if (bottleOfSoda.getName().equals(name) && bottleOfSoda.getTaste() == taste)
                    return bottleOfSoda;
            }
        }
        return null;
    }


}
