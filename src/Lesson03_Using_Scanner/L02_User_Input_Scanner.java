package Lesson03_Using_Scanner;

import java.util.Scanner;

public class L02_User_Input_Scanner {
    // Get a double and an int from the user,
// then print their sum and product.
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

System.out.println("Please enter a decimal number...");
    double enteredDecimalNumber = scanner.nextDouble();

System.out.println("Please enter an integer...");
    int enteredInteger = scanner.nextInt();

// Print the sum of the entered numbers
System.out.println("The sum of the entered numbers: " + (enteredDecimalNumber + enteredInteger));

// Print the product of the entered numbers
System.out.println("The product of the entered numbers: " + (enteredDecimalNumber *enteredInteger));


}
}

