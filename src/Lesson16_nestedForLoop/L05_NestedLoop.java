package Lesson16_nestedForLoop;

import java.util.Scanner;

public class L05_NestedLoop {

    public static void main(String[] args) {

        /*
            Get the number of rows and columns from the user and print the following pattern:
            Example: If rows = 4 and columns = 5, the output should be:

             2 3 4 5 6
             3 4 5 6 7
             4 5 6 7 8
             5 6 7 8 9
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows for the shape...");
        int numberOfRows = scanner.nextInt();

        System.out.println("Please enter the number of elements in each row...");
        int elementsPerRow = scanner.nextInt();

        for (int i = 1; i <= numberOfRows; i++) { // controls the number of rows

            for (int j = 1; j <= elementsPerRow; j++) { // controls the number of elements in each row
                System.out.print(i + j + " ");
            }
            System.out.println(); // goes to the next line after printing each row
        }
    }
}