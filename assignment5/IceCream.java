public class IceCream extends DessertItem {
    protected final int price;

    public IceCream(String name, int price) throws NameTooLongException {
        super(name);
        this.price = price;
    }
    public int getCost() {
        return price;
    }

    public String toString() {
        return this.getName();
    }

}
