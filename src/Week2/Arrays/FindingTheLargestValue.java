package Week2.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.Random;

public class FindingTheLargestValue {
    public static void main(String[] args) {

        int max = 0;
        Random r = new Random();
        int[] arr = new int[10];
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(100); // 0 to 99
            arr[i] = index + 1; // 1 ro 100
            if(max < arr[i]) {
                max = arr[i];
            }
            System.out.print(arr[i] + " ");

        }
        //System.out.println(Arrays.toString(arr));
        System.out.println("\n\nThe largest value is " + max);


    }
}
