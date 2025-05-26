package Lesson15_ForLoop;

import java.util.Scanner;

public class L02_ForLoop {

    public static void main(String[] args) {

        // Print the sum of all two-digit numbers divisible by 5

        int sum = 0;

        for (int i = 10; i < 100; i += 5) {
            sum += i;
        }

        System.out.println(sum); // Output: 945

        // Take starting and ending values from the user
        // and calculate the sum of all numbers between them (inclusive)
        // that are divisible by 5
        // then print the total sum

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the starting value...");
        int start = scanner.nextInt();

        System.out.println("Please enter the ending value...");
        int end = scanner.nextInt();

        sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println("The sum of the numbers divisible by 5 between the given values: " + sum);

        scanner.close(); // Best practice to close the scanner
    }

}
