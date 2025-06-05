package Lesson21_whileLoop_doWhileLoop;

import java.util.Scanner;

public class L06_PerfectSquareCheck {

    public static void main(String[] args) {

        // Question 3:
        // Ask the user to enter a positive integer.
        // Check if the number is a perfect square.
        // If it is, print true; otherwise, print false.
        // Example: input = 16 (4*4) → output = true

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer...");
        int number = scanner.nextInt();
        int squareRoot = 1;

        while (squareRoot * squareRoot <= number) {

            if (squareRoot * squareRoot == number) {
                System.out.println(true);
                break;
            }

            squareRoot++;

            if (squareRoot * squareRoot > number) {
                System.out.println(false);
                break;
            }
        }
    }
}