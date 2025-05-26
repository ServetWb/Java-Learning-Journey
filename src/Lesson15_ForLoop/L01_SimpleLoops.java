package Lesson15_ForLoop;

import java.util.Scanner;

public class L01_SimpleLoops {

    public static void main(String[] args) {

        // Print the numbers from 1 to 5 side by side
        // with a space between each number

        System.out.println("1 2 3 4 5");

        // Print the numbers from 1000 to 5000 side by side
        // with a space between each number
        // (This part was missing code in your original version — if needed, you can add a loop here)

        // Print the numbers from 101 to 145 (inclusive)
        // side by side with a space between each number

        for (int i = 1501; i <= 1575; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Print all two-digit even numbers

        for (int i = 10; i <= 99; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Starting from 100 up to 245 (inclusive),
        // print the numbers by incrementing 9 each time

        for (int i = 100; i <= 245; i += 9) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Starting from 100 down to 0,
        // print the numbers by decrementing 3 each time

        for (int i = 100; i >= 0; i -= 3) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Take starting and ending values from the user,
        // and print all the numbers between them (inclusive)
        // side by side with a space between each number

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the starting value...");
        int start = scanner.nextInt();

        System.out.println("Please enter the ending value...");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }

        scanner.close(); // Always good practice to close Scanner when done

    }
}