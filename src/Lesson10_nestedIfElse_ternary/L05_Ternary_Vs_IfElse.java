package Lesson10_nestedIfElse_ternary;

import java.util.Scanner;

public class L05_Ternary_Vs_IfElse {
    public static void main(String[] args) {

        // Ask the user to enter a positive three-digit integer
        // If the number is 500 or greater, calculate and print the sum of its digits
        // If the number is less than 500, print the square of the tens digit

        /*
            We can distinguish whether the number is greater than 500
            using a ternary operator.
            HOWEVER, calculating the sum of digits
            or finding the tens digit and squaring it
            are not simple one-line operations,
            THEREFORE, the TERNARY OPERATOR CANNOT BE USED in this task.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive three-digit integer...");
        int number = scanner.nextInt(); // Example: 347

        int digit = 0;
        int digitSum = 0;

        if (number > 500) {

            digit = number % 10;
            digitSum += digit;
            number /= 10;

            digit = number % 10;
            digitSum += digit;
            number /= 10;

            digit = number % 10;
            digitSum += digit;
            number /= 10;

            System.out.println("Sum of the digits of the entered number: " + digitSum);

        } else { // if the number is not greater than 500 (e.g., 347)

            // Remove the ones digit → e.g., from 347 to 34
            number /= 10;

            digit = number % 10;

            System.out.println("Square of the tens digit: " + digit * digit);
        }
    }
}