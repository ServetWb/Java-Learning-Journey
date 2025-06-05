package Lesson21_whileLoop_doWhileLoop;

import java.util.Scanner;

public class L02_SummingNumbers {

    public static void main(String[] args) {
        // Question 4: Ask the user to enter positive integers to be summed.
        // Tell the user to enter 0 when they want to stop.
        // If the total exceeds 500 or the user enters 0:
        // - Print how many valid positive numbers were entered,
        // - And print the total sum.
        // If the user enters a negative number,
        // Print "You cannot use negative numbers" and
        // Do NOT include that number in the count or sum.

        /*
            There are two important things to consider in a while loop:

            1. The values that control the loop’s continuation (in this case, `number` and `totalSum`)
               must be updated inside the loop.
               If not, an infinite loop might occur.

            2. If we assign an initial value to the loop condition variables before the loop,
               it must be a value that allows the loop to start.
               Otherwise, the loop might technically run, but the body won’t be executed at all.
         */

        Scanner scanner = new Scanner(System.in);
        int number = 10;           // initialized with a non-zero value to enter the loop
        int totalSum = 0;          // will store the total of valid numbers
        int count = 0;             // will store how many valid numbers were entered

        while (totalSum <= 500 && number != 0) { // loop condition

            System.out.println("Please enter a positive integer to be summed.\nPress 0 to finish:");
            number = scanner.nextInt(); // get new input from the user

            if (number > 0) {
                totalSum += number;     // add number to total
                count++;                // increment count
            } else if (number < 0) {
                System.out.println("You cannot use negative numbers.");
                // do NOT add to sum or count
            }

        }

        System.out.println("You entered " + count + " positive numbers.");
        System.out.println("The total sum of the numbers is: " + totalSum);
    }
}
