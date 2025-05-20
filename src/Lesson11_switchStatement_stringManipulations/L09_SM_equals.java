package Lesson11_switchStatement_stringManipulations;

public class L09_SM_equals {
    public static void main(String[] args) {
        String str1 = "Joe";
        String str2 = "J" + "o" + "e";
        String str3 = new String("Joe");

        // To check if two different strings are the same in Java, we don't use '=='
        // For this comparison, we use the equals() method

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true

        String str4 = "joe";
        String str5 = "JOE";
        String str6 = "JOe";
        String str7 = "Joe ";
        String str8 = "J oe";

        /*
            The equals() method compares strings based on:
            1. The number of characters
            2. Whether the characters at the same indexes are identical

            If there is any difference, it returns false.
            If both the character count and characters at corresponding indexes are the same, it returns true.
         */
        System.out.println(str1.equals(str4)); // Joe <==> joe  ==> false
        System.out.println(str1.equals(str5)); // Joe <==> JOE  ==> false
        System.out.println(str1.equals(str6)); // Joe <==> JOe  ==> false
        System.out.println(str1.equals(str7)); // Joe <==> "Joe " ==> false
        System.out.println(str1.equals(str8)); // Joe <==> J oe ==> false


        /*
            If you want to compare two strings without considering case differences,
            you can use equalsIgnoreCase().
         */

        System.out.println("================");
        System.out.println(str1.equalsIgnoreCase(str4)); // Joe <==> joe  ==> true
        System.out.println(str1.equalsIgnoreCase(str5)); // Joe <==> JOE  ==> true
        System.out.println(str1.equalsIgnoreCase(str6)); // Joe <==> JOe  ==> true
        System.out.println(str1.equalsIgnoreCase(str7)); // Joe <==> "Joe " ==> false
        System.out.println(str1.equalsIgnoreCase(str8)); // Joe <==> "J oe" ==> false


    }
}
