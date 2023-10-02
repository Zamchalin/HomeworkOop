public class Cat {
        private String name;
        private int appetite;
        public Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
        }
        public void eat() { }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

}
