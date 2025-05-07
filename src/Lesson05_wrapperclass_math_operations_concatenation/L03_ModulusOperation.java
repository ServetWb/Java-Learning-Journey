package Lesson05_wrapperclass_math_operations_concatenation;

import java.util.Scanner;

public class L03_ModulusOperation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        int enteredNumber = scanner.nextInt();

// If we are asked whether the number is even or odd

        System.out.println(enteredNumber % 2);
// We check the result of this operation
// If the result is 0, the number is even; if the result is not 0, the number is odd

// If we are asked whether the number is a multiple of 5

        System.out.println(enteredNumber % 5);
// We check the result of this operation
// If the result is 0, the number is a multiple of 5; if not, it is not a multiple of 5

// If we are asked to find the ones digit (units place) of the number
        System.out.println(enteredNumber % 10);

        System.out.println("===================");
// number / 10 and number % 10 are not the same

        int number = 245;

        System.out.println(number % 10); // 5

        System.out.println(number / 10); // 24

        System.out.println(number); // 245

// If we want to update the number to 24

        number = number / 10;

        System.out.println("The new value of the number: " + number);

    }
}
