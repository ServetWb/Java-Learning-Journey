package Lesson15_ForLoop;

import java.util.Scanner;

public class L06_FactorialCalculation {
    public static void main(String[] args) {

        // Ask the user to enter a positive integer less than 17,
        // and calculate the factorial of that number.
        // Example: 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer less than 17...");
        int inputNumber = scanner.nextInt();

        int factorial = 1;

        for (int i = inputNumber; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println("The factorial of " + inputNumber + " is: " + factorial);

        scanner.close(); // Best practice to close the scanner

    }
}