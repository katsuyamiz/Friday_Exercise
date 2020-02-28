package Week2.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        int max = 0;
        Random r = new Random();
        int[] arr = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(100); // 0 to 99
            arr[i] = index + 1; // 1 ro 100
            System.out.print(arr[i] + " ");
        }
        //System.out.println("Array: " + Arrays.toString(arr));
        System.out.print("\nValue to find: ");
        int s = in.nextInt();
        boolean f = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                System.out.print("\n" + s + " is in slot " + i + ".");
                f = true;
            }
        }
            if (!f) {
                System.out.println("\n" + s + " is not in the array");

            }

        }

    }






