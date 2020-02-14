package Week1.Variables;

import org.w3c.dom.ls.LSOutput;

public class StillUsingVariables {

    public static void main(String[] args) {

        String name = "Juan Valdez";
        int year = 2010;

        String answer = String.format("My name is %s and I'll graduate in %d.", name, year);
        System.out.println(answer);
    }

    }
