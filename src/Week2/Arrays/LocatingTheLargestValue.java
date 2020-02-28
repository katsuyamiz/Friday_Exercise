package Week2.Arrays;

import java.util.Arrays;
import java.util.Random;

public class LocatingTheLargestValue{
    public static void main(String[] args) {
        int max = 0;

        Random r = new Random();
        int[] arr = new int[10];
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(100); // 0 to 99
            arr[i] = index + 1;
            if(max < arr[i]) {
                max = arr[i];
            }
            System.out.print(arr[i] + " ");

        }
        //System.out.println("Array: " + Arrays.toString(arr));

        System.out.println("\n\nThe largest value is " + max);
        System.out.println("It is in slot " + find(arr, max));


    }

    public static int find(int[] a, int target)
    {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target)
                return i;

        return -1;

    }


}
