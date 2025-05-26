package Lesson15_ForLoop;

import java.util.Scanner;

public class L04_SumOfNumbersInBetween {
    public static void main(String[] args) {

        // Question 3:
        // Ask the user to enter starting and ending values as positive integers.
        // Print the sum of all numbers between them, including the boundaries.
        // The code should work even if the ending value is smaller than the starting value.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the starting value...");
        int start = scanner.nextInt();

        System.out.println("Please enter the ending value...");
        int end = scanner.nextInt();

        int sum = 0;

        if (start < end) {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        } else {
            // start > end
            for (int i = start; i >= end; i--) {
                sum += i;
            }
        }

        System.out.println("The sum of the numbers in between: " + sum);

        scanner.close(); // Always good practice to close the scanner
    }
}