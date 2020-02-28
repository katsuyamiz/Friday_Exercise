package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists {
    public static void main(String[] args) {

        Random r = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10 ; i++) {
            int index = r.nextInt(100); // 0 to 99
            arrayList.add(index + 1);

        }
        System.out.println("ArrayList: " + arrayList);
    }
}
