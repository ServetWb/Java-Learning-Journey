package Lesson16_nestedForLoop;

public class L04_nestedForLoop {

    public static void main(String[] args) {

        // Print 1 2 3 4 using a for loop
        for (int i = 1; i <= 4; i++) {
            System.out.print(1 * i + " ");
        }
        System.out.println();

        // Use the same loop to print 2 4 6 8
        for (int i = 1; i <= 4; i++) {
            System.out.print(2 * i + " ");
        }
        System.out.println();

        // Use the same loop to print 3 6 9 12
        for (int i = 1; i <= 4; i++) {
            System.out.print(3 * i + " ");
        }
        System.out.println();

        // Use the same loop to print 4 8 12 16
        for (int i = 1; i <= 4; i++) {
            System.out.print(4 * i + " ");
        }
        System.out.println();


        /*
            Use a single process to print the following pattern:

            1  2  3  4
            2  4  6  8
            3  6  9 12
            4  8 12 16

            If we need to print multiple rows with an equal number of elements in each row,
            we can use nested loops.

            If the desired output is rectangular in shape:
            - The outer loop determines the number of rows,
            - The inner loop determines the number of elements in each row.
         */

        for (int i = 1; i <= 4; i++) {  // Outer loop defines number of rows

            for (int j = 1; j <= 4; j++) { // Inner loop defines number of elements per row

                System.out.print(i * j + "  ");
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}