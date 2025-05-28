package Lesson16_nestedForLoop;

import java.util.Scanner;

public class L09_NumberTrianglePattern {

    public static void main(String[] args) {

        /*
            Get the number of rows from the user and draw the following pattern:
            Example: If rows = 5, the output should be:

                0
                0 1
                0 1 2
                0 1 2 3
                0 1 2 3 4
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows for the pattern...");
        int rowCount = scanner.nextInt();

        for (int i = 1; i <= rowCount; i++) { // controls the rows
            for (int j = 1; j <= i; j++) { // prints numbers from 0 up to i-1
                System.out.print(j - 1 + " ");
            }
            System.out.println(); // moves to the next line
        }
    }
}