public class DessertShoppe {
    public static int tax = 10;
    public static int maxSize = 50;
    public static int width = 20;
    public static String name = "M & M Dessert Shoppe";
    public static String cents2dollarsAndCentsmethod(int cents) {
        float c = cents;
        c = c/100;
        return Float.toString(c);
    }
}
