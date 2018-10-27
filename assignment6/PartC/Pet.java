package PartC;

public class Pet {
    private String name;
    private String ownerName;
    private String color;
    protected int sex;

    public Pet (String name, String ownerName, String color) {
        this.name = name;
        this.ownerName = ownerName;
        this.color = color;
    }
    public String getPetName() {
        return this.name;
    }
    public String getOwnerName() {
        return this.ownerName;
    }
    public String getColor() {
        return this.color;
    }
    public void setSex(int sexid) {
        this.sex = sexid;
    }
    public String getSex() {
        return Sex.getSex(this.sex);
    }

    public String toString() {
        return String.format("%s owned by %s\nColor: %s \nSex: %s", this.getPetName(), this.getOwnerName(), getColor(), getSex());
    }

    protected enum Sex {
        MALE(1), FEMALE(2), SPAYED(3), NEUTERED(4);
        private final int id;
        Sex(int id) { this.id = id; }
        public static String getSex(int id) {
            for (Sex each : Sex.values()) {
                if (each.id == id)
                    return each.name();
            }
            return "unsupported sexid";
        }
    }

    public static void main(String[] args) {
        Pet pet = new Pet("Spot", "Mary", "Black and White");
        pet.setSex(1);
        System.out.println(pet);
    }
}
