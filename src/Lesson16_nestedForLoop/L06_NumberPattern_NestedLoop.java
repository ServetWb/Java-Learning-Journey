package Lesson16_nestedForLoop;

import java.util.Scanner;

public class L06_NumberPattern_NestedLoop {
    /*
        Get the number of rows and columns from the user, then print the following pattern:
        Example: If rows = 4 and columns = 5, the output should be:

         1 2 3 4 5
         2 3 4 5 6
         3 4 5 6 7
         4 5 6 7 8
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of rows...");
        int rowCount = scanner.nextInt();

        System.out.println("Please enter the number of elements in each row...");
        int elementsPerRow = scanner.nextInt();

        for (int i = 1; i <= rowCount; i++) { // controls the rows
            for (int j = 1; j <= elementsPerRow; j++) { // controls the elements in each row
                System.out.print(i + j - 1 + " ");
            }
            System.out.println(); // moves to the next line after each row
        }
    }
}
