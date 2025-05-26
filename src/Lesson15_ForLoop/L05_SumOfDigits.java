package Lesson15_ForLoop;

import java.util.Scanner;

public class L05_SumOfDigits {
    public static void main(String[] args) {

        // Ask the user to enter a positive integer,
        // and print the sum of its digits as shown below.
        // Example:
        // Input : 1453
        // Output => 1+4+5+3 = 13
        // Final output : "The sum of the digits of the number 1453 is: 13"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer...");
        int inputNumber = scanner.nextInt();
        int number = inputNumber;

        int digit = 0;
        int sumOfDigits = 0;

        // Get the number of digits by converting the number to a String
        int digitCount = (inputNumber + "").length();

        for (int i = 1; i <= digitCount; i++) {
            digit = number % 10;         // Extract the last digit
            sumOfDigits += digit;        // Add it to the total
            number /= 10;                // Remove the last digit
        }

        System.out.println("The sum of the digits of the number " + inputNumber + " is: " + sumOfDigits);

        scanner.close(); // Good practice to close the scanner
    }
}