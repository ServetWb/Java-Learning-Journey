package Lesson19_Methods_Creationusage;

import java.util.Scanner;

public class L03_PrintMessageBasedOnFactorialValue {
    public static void main(String[] args) {

        // Ask the user to enter a positive integer less than 17
        // Calculate the factorial value of the entered number
        // If the factorial is less than 1,000,000 → print "Nice number!"
        // If the factorial is 1,000,000 or more → print "Where did you find this number?"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer less than 17...");
        int enteredNumber = scanner.nextInt();

        int factorial = L02_ReturnFactorialValue.calculateFactorial(enteredNumber);

        if (factorial < 1_000_000) {
            System.out.println("Nice number!");
        } else {
            System.out.println("Where did you find this number?");
        }
    }
}