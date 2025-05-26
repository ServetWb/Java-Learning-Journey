package Lesson15_ForLoop;

import java.util.Scanner;

public class L03_SumOfNumbersInBetween {

    public static void main(String[] args) {
        // Question 3:
        // Ask the user to enter starting and ending values as positive integers.
        // Print the sum of all numbers between them, including the boundaries.
        // If the ending value is smaller than the starting value,
        // display a warning and terminate the operation.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the starting value...");
        int start = scanner.nextInt();

        System.out.println("Please enter the ending value...");
        int end = scanner.nextInt();

        int sum = 0;

        if (end < start) {
            System.out.println("The ending value cannot be smaller than the starting value...");
        } else {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        }

        System.out.println("The sum of the numbers in between: " + sum);

        scanner.close(); // Good practice to close the scanner
    }
}
