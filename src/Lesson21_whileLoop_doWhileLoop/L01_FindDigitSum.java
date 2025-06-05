package Lesson21_whileLoop_doWhileLoop;

public class L01_FindDigitSum {

    public static void main(String[] args) {

        // Create a method that calculates and returns the sum of digits
        // of a given positive integer using a while loop

        System.out.println("Sum of digits of 1234: " + getDigitSum(1234));
        System.out.println("Sum of digits of 12: " + getDigitSum(12));
        System.out.println("Sum of digits of 100001: " + getDigitSum(100001));
    }

    public static int getDigitSum(int number) {
        int digit = 0;
        int digitSum = 0;

        while (number > 0) {
            digit = number % 10;         // Get the last digit
            digitSum += digit;           // Add it to the sum
            number /= 10;                // Remove the last digit
        }

        return digitSum;
    }
}
