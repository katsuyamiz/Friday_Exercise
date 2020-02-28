package Week2.Arrays;



import java.util.Arrays;
import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] basic = new int[10];
        for(int i = 0; i < basic.length; i++) {
            int index = r.nextInt(100); // 0 to 99
            basic[i] = index + 1; // 1 ro 100
            System.out.println("Slot "+ i + " contains a " + basic[i]);

        }
            //System.out.println(Arrays.toString(basic));
    }



}
