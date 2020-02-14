package Week1.KeyboardInput;
import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Hello.  What is your name?");
        String name = in.nextLine();

        System.out.println("\nHi, " + name + "!  How old are you?");
        int age = in.nextInt();

        System.out.println("\nSo you're " + age + ", eh?  That's not old at all!\n" +
                "How much do you make, " + name + "?");
        double sal = in.nextDouble();

        System.out.println("\n" + sal + "!  I hope that's per hour and not per year! LOL!");
        // double has to be 8.50 -> 8.5
    }
}