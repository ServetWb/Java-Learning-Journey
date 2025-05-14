package Lesson07_Operators_IfElse_Statements;

public class L03_And_Or_Choice {
    public static void main(String[] args) {

          /*
            If we are asked to check whether a given value
            falls within a specified range,
            then we use **AND (&&)**
         */

        int number = 999;

        // If the given number is a 2-digit positive number, print true; otherwise, print false
        System.out.println(number >= 10 && number <= 99);

        // If the given number is greater than 97 and less than 212, print true;
        // otherwise, print false
        System.out.println(number > 97 & number < 212);

        char character = 'j';

        // If the given character is a lowercase letter, print true;
        // if not a lowercase letter, print false
        System.out.println(character >= 'a' && character <= 'z');

        // We can also solve this using the Wrapper class
        System.out.println(Character.isLowerCase(character));

        /*
            If we are asked to check whether a given value
            is **outside** of a specific range,
            then we use **OR (||)**
         */

        number = 154;

        // If the given number is NOT a 2-digit positive number, print true;
        // otherwise, print false
        System.out.println(number < 10 || number > 99);

        System.out.println("==============");

        character = ')';

        // If the given character is an uppercase letter, print false;
        // if NOT an uppercase letter, print true
        System.out.println(character < 'A' || character > 'Z');

        System.out.println(!Character.isUpperCase(character));

        System.out.println(!(character >= 'A' && character <= 'Z'));
    }
}
