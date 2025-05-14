package Lesson07_Operators_IfElse_Statements;

import java.util.Scanner;

public class L07_ImportantPoints {
    public static void main(String[] args) {

        // Question 3 - Ask the user for an integer
        //              If the number is divisible by 3, print "Number divisible by 3"
        //              If the number is divisible by 5, print "Number divisible by 5"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        int number = scanner.nextInt();

        /*
            The if body can contain more than one line.

            Curly braces {} for the if body are optional.

            HOWEVER, if curly braces are not used,
            only the first statement up to the semicolon (;) is considered as part of the if body.
            Anything after the first semicolon is NOT linked to the if condition.

            IN OTHER WORDS,
            if the if body consists of ONLY ONE statement, curly braces {} are optional.
            But if the if body includes MULTIPLE statements,
            you MUST use curly braces {} to group them.
         */

        if (number % 3 == 0)
            System.out.println("Number divisible by 3");
        System.out.println("Second line of multiple of 3");
        System.out.println("Third line of multiple of 3");

        if (number % 5 == 0) {
            System.out.println("Number divisible by 5");
            System.out.println("Second line of multiple of 5");
            System.out.println("Third line of multiple of 5");
        }
    }
}