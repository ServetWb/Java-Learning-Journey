package Lesson20_WhileLoop;

public class L01_forLoopVsWhileLoop {

    public static void main(String[] args) {

        // Print all 2-digit positive integers
        // from largest to smallest, separated by a space
        for (int i = 99; i >= 10; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Do the same task using a while loop

        int number = 99;

        while (number >= 10) {
            System.out.print(number + " ");
            number--;
        }

        System.out.println();

        // Starting from a given positive integer
        // print the first 10 numbers

        int givenNumber = 209;

        for (int i = 0; i <= 9; i++) {
            System.out.print(givenNumber + i + " ");
        }

        System.out.println();

        // Same task using a while loop

        givenNumber = 209;
        int counter = 0;

        while (counter <= 9) {
            System.out.print(givenNumber + counter + " ");
            counter++;
        }
    }
}