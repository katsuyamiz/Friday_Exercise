
package Week1.WhileLoops;


import java.util.Scanner;

public class AddingValuesInLoop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        System.out.println("I will add up the number you give me.");


        while (true){
            try {
                System.out.print("Number: ");
                int i = in.nextInt();


                if (i != 0) {
                    sum = sum + i;

                } else {
                    System.out.println("\nThe total is " + sum);
                    System.exit(0);
                }

            } finally{
                System.out.println("The total so far is " + sum);
            }






        }
    }
}
