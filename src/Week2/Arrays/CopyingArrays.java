package Week2.Arrays;

import java.util.Arrays;
import java.util.Random;

public class CopyingArrays {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        int[] copy = new int[10];


        for(int i = 0; i < arr.length; i++) {
            int index = r.nextInt(100); // 0 to 99
            arr[i] = index + 1; // 1 ro 100

        }

        copy = arr.clone();
        arr[arr.length - 1] = -7;

        System.out.print("Array1: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.print("\nArray2: ");
        for (int i =0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");

        }





        //System.out.println("Array 1: " + Arrays.toString(arr));
        //System.out.println("Array 2: "+ Arrays.toString(copy));
    }
}
