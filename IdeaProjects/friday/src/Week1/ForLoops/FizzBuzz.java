package Week1.ForLoops;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100;){
            i += 1;
            if (i % 3 == 0 && i % 5 != 0){
                System.out.println("Fizz");
            }if (i % 5 == 0 && i % 3 != 0){
                System.out.println("Buzz");
            }if (i % 15 == 0){
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
            }

    }
}
