package Week1.KeyboardInput;
import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {




        Scanner in = new Scanner(System.in);

        System.out.print("Hello.  What is your name? ");
        String name = in.nextLine();

        System.out.print("\nHi, " + name + "!  How old are you? ");
        int age = in.nextInt();
        int fage = age + 5;
        int page = age - 5;

        System.out.print("\nDid you know that in five years you will be " + fage + " years old?" +
                "\nAnd five years ago you were " + page +"! Imagine that!");


    }
}
