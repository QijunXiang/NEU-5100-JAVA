import java.util.List;
import java.util.ArrayList;

public class Checkout {
    public List<DessertItem> dessertList;
    public Checkout() {
        this.dessertList = new ArrayList<>();
    }

    public int numberOfItems() {
        return this.dessertList.size();
    }

    public void enterItem(DessertItem item) {
        this.dessertList.add(item);
    }

    public void clear() {
        this.dessertList.clear();
    }

    public int totalCost() {
        int total_cost = 0;
        for (DessertItem item: dessertList)
            total_cost += item.getCost();
        return total_cost;
    }

    public int totalTax() {
        int total_tax = this.totalCost()*DessertShoppe.tax/100;
        return total_tax;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (DessertItem item: dessertList) {
            sb.append(this.buildStringWithWidth(item.toString()));
            sb.append("          ");
            sb.append(DessertShoppe.cents2dollarsAndCentsmethod(item.getCost()) + "\n");
        }
        return sb.toString();
    }

    private String buildStringWithWidth(String str) {
        String result = "";
        String content = str;
        while(content.length() > DessertShoppe.width) {
            if (result.length() != 0)
                result += "\n";
            result += content.substring(0, DessertShoppe.width);
            content = content.substring(DessertShoppe.width);
        }

        if (content.length() != 0) {
            int buffer = DessertShoppe.width;
            result += "\n" + content;
            while(buffer > content.length()) {
                result += " ";
                buffer--;
            }
        }
        return result;
    }

}
