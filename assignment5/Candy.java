public class Candy extends DessertItem {
    private final double weight;
    private final int price;

    public Candy(String name, double weight, int price) throws NameTooLongException {
        super(name);
        this.weight = weight;
        this.price = price;
    }

    public int getCost() {
        return (int)weight*price;
    }

    public String toString() {
        return Double.toString(weight) + " lbs. @ " + Integer.toString(price) + " /lb. " + this.getName();
    }
}
