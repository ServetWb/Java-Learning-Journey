package Lesson21_whileLoop_doWhileLoop;

import java.util.Scanner;

public class L04_DoWhileLoop_Disadvantage {

    public static void main(String[] args) {


     /*
            Advantage of Do-While Loop:
                The loop body runs at least once, even if the condition is false.

            Disadvantage of Do-While Loop:
                The loop body runs at least once, even if it shouldn't.

            For example, in the task below:
            If the user enters 0, ideally the loop body should not run at all.
            However, because the `do` block executes before the `while` condition is checked,
            it prints 0 even though it shouldn’t.
         */

        // Task:
        // Starting from the positive integer entered by the user,
        // print all numbers down to 1,
        // separated by a space, in a single line.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer...");
        int number = scanner.nextInt();

        do {
            System.out.print(number + " ");
            number--;
        } while (number >= 1);

    }
}

