public class Cookie extends DessertItem {
    private final int number;
    private final int price;

    public Cookie(String name, int number, int price) throws NameTooLongException {
        super(name);
        this.number = number;
        this.price = price;
    }

    public int getCost() {
        return number*price/12;
    }

    public String toString() {
        return Integer.toString(number) + " @ " + Integer.toString(price) + " /dz. \n" + this.getName();
    }

}
