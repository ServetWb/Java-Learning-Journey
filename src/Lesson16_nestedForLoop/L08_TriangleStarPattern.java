package Lesson16_nestedForLoop;

import java.util.Scanner;

public class L08_TriangleStarPattern {
    public static void main(String[] args) {

        /*
            Get the number of rows from the user and draw the following pattern:
            Example: If rows = 5, the output should be:

                *
                * *
                * * *
                * * * *
                * * * * *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows for the pattern...");
        int rowCount = scanner.nextInt();

        for (int i = 1; i <= rowCount; i++) { // controls the rows
            for (int j = 1; j <= i; j++) { // prints stars up to the current row number
                System.out.print("* ");
            }
            System.out.println(); // moves to the next line
        }

    }
}