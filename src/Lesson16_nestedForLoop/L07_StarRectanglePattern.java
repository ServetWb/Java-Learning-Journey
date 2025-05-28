package Lesson16_nestedForLoop;

import java.util.Scanner;

public class L07_StarRectanglePattern {
    public static void main(String[] args) {

        /*
            Get the number of rows and columns from the user and draw the following shape:
            Example: If rows = 3 and columns = 6, the output should be:

                * * * * * *
                * * * * * *
                * * * * * *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows for the shape...");
        int numberOfRows = scanner.nextInt();

        System.out.println("Please enter the number of elements in each row...");
        int elementsPerRow = scanner.nextInt();

        for (int i = 1; i <= numberOfRows; i++) { // controls the rows

            for (int j = 1; j <= elementsPerRow; j++) { // controls the number of elements in each row

                System.out.print("* ");
            }

            System.out.println(); // moves to the next line after each row
        }
    }
}