package Lesson06_Increment_Decrement;

public class L01_preIncrement_postIncrement {
    public static void main(String[] args) {

       /*
        IF they are alone on the line,
            there is no difference between
            a++ and ++a
            b-- and --b
       */

        int a = 10;
        int b = 20;
        a++;

        System.out.println("Line 13, value of a: " + a); // Line 13, value of a: 11

        ++a;

        System.out.println("Line 17, value of a: " + a); // Line 17, value of a: 12

        b--;

        System.out.println("Line 22, value of b: " + b); // Line 22, value of b: 19

        --b;

        System.out.println("Line 26, value of b: " + b); // Line 26, value of b: 18


    }
}
