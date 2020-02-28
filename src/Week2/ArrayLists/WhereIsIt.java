package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {


        Random r = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int index = r.nextInt(100); // 0 to 99
            arrayList.add(index + 1);
        }
        System.out.println("ArrayList: " + arrayList);
        System.out.print("Value to find: ");
        int value = in.nextInt();
        int len = arrayList.size();
        for (int i = 0; i < len; i ++ ){
            if (arrayList.get(i) == value){
                System.out.println("\n" + value + " is in slot " + i + ".");
            }
            if (!arrayList.contains(value)){
                System.out.println("\n" + value + " is not in the ArrayList.");
                break;
            }
        }


    }
}

