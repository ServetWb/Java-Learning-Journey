package Lesson20_WhileLoop;

import java.util.Scanner;

public class L02_WhileLoop {

    public static void main(String[] args) {

        // Ask the user to enter positive integers
        // As long as the user keeps entering positive numbers,
        // keep summing them up
        // If the user wants to finish the process, they should enter 0
        // If the user enters a negative number, show a warning message
        // and do not include the negative number in the total

        Scanner scanner = new Scanner(System.in);

        int enteredNumber = 10;
        int sumOfNumbers = 0;

        while (enteredNumber != 0) {
            // We write the condition for the loop to continue, not to stop

            System.out.println("Please enter a positive integer...");
            enteredNumber = scanner.nextInt();

            if (enteredNumber > 0) {
                sumOfNumbers += enteredNumber;
            } else if (enteredNumber < 0) {
                System.out.println("You must enter a positive number...");
            }
        }

        System.out.println("The sum of the entered positive integers is: " + sumOfNumbers);
    }
}

