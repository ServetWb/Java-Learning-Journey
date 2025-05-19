package Lesson10_nestedIfElse_ternary;

import java.util.Scanner;

public class L08_NestedTernary {

    public static void main(String[] args) {

        // Ask the user to input an integer
        // Print "positive", "negative", or "neutral" based on the input

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        int number = scanner.nextInt();

        // Check if the number is positive or not
        System.out.println(number > 0 ? "positive" : "This could be negative or neutral");

        // Using nested ternary to check for positive, negative, or neutral
        System.out.println(number > 0 ? "positive" : (number < 0 ? "negative" : "neutral"));

        // Another way to write the same check with nested ternary
        System.out.println(number > 0 ? "positive" : number < 0 ? "negative" : "neutral");

        // If the number is odd, print "multiple of 3" or "not a multiple of 3"
        // If the number is even, print "multiple of 5" or "not a multiple of 5"

        System.out.println(
                number % 2 == 0
                        ?
                        // "even number"
                        number % 5 == 0 ? "multiple of 5" : "not a multiple of 5"
                        :
                        // "odd number"
                        number % 3 == 0 ? "multiple of 3" : "not a multiple of 3");


        // Using a more condensed nested ternary for the same check
        System.out.println(
                number % 2 == 0
                        ? number % 5 == 0 ? "multiple of 5" : "not a multiple of 5"
                        : number % 3 == 0 ? "multiple of 3" : "not a multiple of 3");


    }
}
