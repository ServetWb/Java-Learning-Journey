package Lesson03_Using_Scanner;

import java.util.Scanner;

public class L01_Scanner {
    public static void main(String[] args) {

        // Get an int input from the user
// and print 10 times the entered number as shown below
// e.g.: input => 5   output => The number multiplied by 10 is: 50

        // Step 1: Create a Scanner object
        Scanner scanner = new Scanner(System.in);

// Step 2: Prompt the user for input
        System.out.println("Please enter an int...");

// Step 3: Use the Scanner object to read the input from the console
//         and store it in an appropriate variable

        int enteredNumber = scanner.nextInt();

// e.g.: input => 5   output => The number multiplied by 10 is: 50

        System.out.println("The number multiplied by 10 is: " + (enteredNumber * 10));

    }
}