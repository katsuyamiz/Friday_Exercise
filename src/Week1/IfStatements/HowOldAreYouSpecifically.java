package Week1.IfStatements;
import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Hey, whats's your name? (Sorry, I keep forgetting.) ");
        String name = in.nextLine();

        System.out.print("Ok, " + name + ", how old are you? ");
        int age = in.nextInt();
            if (age < 16){
                System.out.println("\nYou can't drive.");

            }else if (16 <= age && age <=17 ){
                System.out.println("\nYou can drive but not vote.");

            }else if (18 <= age && age <= 24){
                System.out.println("\nYou can vote but not rent a car.");
            }else {
                System.out.println("\nYou can do pretty much anything.");
            }



    }
}
