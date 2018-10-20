public abstract class DessertItem {
    private String name;

    public DessertItem(String name) throws NameTooLongException {
        try {
            if (name.length() > DessertShoppe.maxSize)
                throw new NameTooLongException(name + " exceeds the max name length " + Integer.toString(DessertShoppe.maxSize));
            this.name = name;
        } catch (NameTooLongException e) {
            System.out.println(e.getMessage());
            throw e;
        }

    }

    public final String getName() {
        return this.name;
    }

    public abstract int getCost();
}
