package Week1.ForLoops;
import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        int c;
        Scanner in = new Scanner(System.in);
        System.out.print("Count to: ");
        c = in.nextInt();

        for (int i = 0; i <= c; ) {
            System.out.print(i + " ");
            i += 1;
        }
    }
}
