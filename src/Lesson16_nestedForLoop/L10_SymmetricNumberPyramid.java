package Lesson16_nestedForLoop;

import java.util.Scanner;

public class L10_SymmetricNumberPyramid {

    public static void main(String[] args) {

        /*
            Get the number of rows from the user and draw the following pattern:
            Example: If rows = 9, the output should be:

                0
                0 1
                0 1 2
                0 1 2 3
                0 1 2 3 4
                0 1 2 3
                0 1 2
                0 1
                0
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows for the pattern...");
        int rowCount = scanner.nextInt();

        if (rowCount % 2 == 0) {
            System.out.println("The number of rows cannot be even.");
        } else {
            // Print the increasing half of the pyramid (including the middle row)
            for (int i = 1; i <= rowCount / 2 + 1; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j - 1 + " ");
                }
                System.out.println();
            }

            // Print the decreasing half of the pyramid
            for (int i = rowCount / 2; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j - 1 + " ");
                }
                System.out.println();
            }
        }
    }
}