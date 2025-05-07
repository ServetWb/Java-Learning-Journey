package Lesson05_wrapperclass_math_operations_concatenation;

import java.util.Scanner;

public class L04_DigitSumCalculator {
    public static void main(String[] args) {

        // Get a 3-digit positive integer from the user
// and print the sum of its digits

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a 3-digit positive integer...");
        int number = scanner.nextInt();  // e.g., 234

        int digit = 0;
        int digitSum = 0;

// Extract the last digit
        digit = number % 10;
        digitSum = digitSum + digit;

// Remove the last digit from the number
        number = number / 10;  // now the number has 2 digits

// Extract the new last digit
        digit = number % 10;
        digitSum = digitSum + digit;

// Remove the last digit again
        number = number / 10;  // now the number has 1 digit

// Add the last remaining digit
        digitSum = digitSum + number;

        System.out.println("Sum of the digits of the entered number: " + digitSum);


    }
}
