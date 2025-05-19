package Lesson10_nestedIfElse_ternary;

import java.util.Scanner;

public class L03_TernaryOperator {

    public static void main(String[] args) {

        // Get a number from the user
        // If the number is even, print "even number"
        // If the number is not even, print "odd number"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer...");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }

        // The ternary operator allows us to write SIMPLE OPERATIONS
        // that can be done with if-else in a shorter and simpler way

        System.out.println(number % 2 == 0 ? "even number" : "odd number");
    }
}