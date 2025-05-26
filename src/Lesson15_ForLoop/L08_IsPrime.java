package Lesson15_ForLoop;

import java.util.Scanner;

public class L08_IsPrime {
    public static void main(String[] args) {

        // Ask the user for a positive integer,
        // check whether the number is prime, and print the result.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer...");
        int enteredNumber = scanner.nextInt();

        for (int i = 2; i <= enteredNumber - 1; i++) {

            if (enteredNumber % i == 0) {
                System.out.println("Not prime, divisible by " + i);
                // if we want to stop the for loop when a condition is met
                break;
            }

            if (i == enteredNumber - 1) {
                System.out.println("The entered number " + enteredNumber + " is prime.");

            }
        }
    }
}