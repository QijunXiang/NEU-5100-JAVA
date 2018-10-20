public class Sundae extends IceCream {
    private final int topping;
    private final String toppingName;

    public Sundae(String name, int price, String toppingName, int topping) throws NameTooLongException {
        super(name, price);
        this.toppingName = toppingName;
        this.topping = topping;
    }

    public int getCost() {
        return this.price+topping;
    }

    public String getToppingName() {
        return this.toppingName;
    }

    public String toString() {
        return this.getName() + " with " + this.getToppingName();
    }
}
