package PartC;

public class Cat extends Pet implements Boardable {
    private String hairLength;
    private int startYear;
    private int startMonth;
    private int startDay;
    private int endYear;
    private int endMonth;
    private int endDay;
    public Cat(String name, String ownerName, String color, String hairLength) {
        super(name, ownerName, color);
        this.hairLength = hairLength;
    }
    public String getHairLength() {
        return this.hairLength;
    }
    public String toString() {
        return String.format("CAT:\n%s\nHair:%s", super.toString(), this.getHairLength());
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
        Cat cat = new Cat("Tom", "Bob", "Black", "Short");
        cat.setSex(3);
        System.out.println(cat);
        cat.setBoardStart(11, 29, 2017);
        cat.setBoardEnd(6, 3, 2018);
        System.out.println(cat.boarding(12, 31, 2017));
        System.out.println(cat.boarding(12, 31, 2016));
        System.out.println(cat.boarding(3, 31, 2018));
    }
}
