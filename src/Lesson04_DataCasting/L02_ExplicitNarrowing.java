package Lesson04_DataCasting;

public class L02_ExplicitNarrowing {
    public static void main(String[] args) {

        int a  = 13;
        int b  = 4567;

//        byte c = a ;
//        byte d = b ;

/*
    When Java compiles code (i.e., scans it and converts it into 1s and 0s that the computer can understand),
    in other words, before you press the Run button,
    it ONLY checks the syntax (formatting and structure).
    It does NOT check actual VALUES.

    If you try to assign a VALUE of a larger data type
    to a VARIABLE of a smaller data type,
    Java will NOT perform this operation AUTOMATICALLY.

    IF you insist on doing it,
    Java asks you to take responsibility
    and somehow fits the large value into the smaller container.
 */

        byte c = (byte)a; // the data type of a is int, but we want to assign it to a byte
        byte d = (byte)b;

        System.out.println("The value of 13 assigned to a byte variable: " + c); // 13
        System.out.println("The value of 4567 assigned to a byte variable: " + d); // -41


        double dbl1 = 74.3;
        float fl1 = 57.98F;

        int num1 = (int)dbl1;

        int num2 = (int)fl1;

        System.out.println("The value of 74.3 assigned to an int variable: " + num1); // 74
        System.out.println("The value of 57.98 assigned to an int variable: " + num2); // 57
    }

}
