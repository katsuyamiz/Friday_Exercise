package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class GettingTheLargestValue {
    public static void main(String[] args) {

        int max = 0;
        Random r = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int index = r.nextInt(100); // 0 to 99
            arrayList.add(index + 1);// 1 ro 100

            if(max < arrayList.get(i)) {
                max = arrayList.get(i);
            }

        }
        System.out.println("ArrayList: " + arrayList);
        System.out.println("\nThe largest value is " + max);

    }
}
