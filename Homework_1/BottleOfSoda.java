public class BottleOfSoda extends Product{

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    private String taste; /*Вкус*/

    public BottleOfSoda(String brand, String name, double price, String taste) {
        super(brand, name, price);
        this.taste = taste;
    }
    @Override
    public String displayInfo() {
        return String.format("[ВОДА] %s - %s - %.2f - вкус: %s",
                brand, name, price, taste);
    }
}

