package PartC;

public class Dog extends Pet implements Boardable{
    private String size;
    private int startYear;
    private int startMonth;
    private int startDay;
    private int endYear;
    private int endMonth;
    private int endDay;
    public Dog(String name, String ownerName, String color, String hairLength) {
        super(name, ownerName, color);
        this.size = hairLength;
    }
    public String getSize() {
        return this.size;
    }
    public String toString() {
        return String.format("DOG:\n%s\nSize:%s", super.toString(), this.getSize());
    }

    public void setBoardStart(int month, int day, int year) {
        this.startDay = day;
        this.startMonth = month;
        this.startYear = year;
    }
    public void setBoardEnd(int month, int day, int year) {
        this.endDay = day;
        this.endMonth = month;
        this.endYear = year;
    }
    public boolean boarding(int month, int day, int year) {
        int start = this.startYear * 12 * 31 + this.startMonth * 31 + this.startDay;
        int end = this.endYear * 12 * 31 + this.endMonth * 31 + this.endDay;
        int cur = year * 12 * 31 + month * 31 + day;
        if (cur == start || cur == end || (cur > start && cur < end))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Tom", "Susan", "White", "medium");
        dog.setSex(3);
        System.out.println(dog);
        dog.setBoardStart(11, 29, 2017);
        dog.setBoardEnd(6, 3, 2018);
        System.out.println(dog.boarding(12, 31, 2017));
        System.out.println(dog.boarding(12, 31, 2016));
        System.out.println(dog.boarding(3, 31, 2018));
    }
}
