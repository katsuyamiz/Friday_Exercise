package Week1.Classes;

public class Driver {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 7, "Blue");
        Rectangle r2 = new Rectangle(10, 2, "Green");
        Rectangle r3 = new Rectangle(15, 12, "Red");
        System.out.println(r1.draw());
        System.out.println(r2.draw());
        System.out.println(r3.draw());
    }
}
