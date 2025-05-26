package Lesson15_ForLoop;

import java.util.Scanner;

public class L07_FactorialCalculation {
    public static void main(String[] args) {

        // Ask the user to enter a positive integer less than 17,
        // then calculate and print the factorial of that number.
        // Print the factorial in the following format:
        // Example: 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer less than 17...");
        int inputNumber = scanner.nextInt();

        int factorial = 1;
        System.out.print(inputNumber + "! = ");

        for (int i = inputNumber; i >= 1; i--) {
            factorial *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print(" * ");
            }
        }

        System.out.println(" = " + factorial);

        scanner.close(); // Close the scanner to free resources

    }
}