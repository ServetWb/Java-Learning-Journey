package Lesson21_whileLoop_doWhileLoop;

import java.util.Scanner;

public class L03_DoWhileLoop_SummingNumbers {
    public static void main(String[] args) {

        // Question 4:
        // Ask the user to enter positive integers to be summed.
        // Tell the user to press 0 when they want to finish.
        // If the total sum exceeds 500 or the user enters 0:
        // - Print how many valid positive numbers were entered,
        // - And the total sum of those numbers.
        // If the user enters a negative number:
        // - Print "You cannot use negative numbers"
        // - Do NOT include it in the count or sum.

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int totalSum = 0;
        int count = 0;

        /*
            If your loop depends on a value entered by the user,
            and you assign an invalid initial value to that variable before the loop,
            the loop body may NEVER execute.

            To prevent that from happening,
            Java provides the Do-While loop.

            In a Do-While loop, the loop body executes once BEFORE checking the condition.
            This way, even if we set a wrong value before the loop,
            the user still gets prompted for input.
         */

        do {
            System.out.println("Please enter a positive integer to be summed.\nPress 0 to finish:");
            number = scanner.nextInt();

            if (number > 0) {
                totalSum += number;
                count++;
            } else if (number < 0) {
                System.out.println("You cannot use negative numbers.");
                // Do not add it to the total or count
            }

        } while (totalSum <= 500 && number != 0); // loop continues unless total exceeds 500 or user enters 0

        System.out.println("You entered " + count + " positive numbers.");
        System.out.println("The total sum of the numbers is: " + totalSum);
    }
}
