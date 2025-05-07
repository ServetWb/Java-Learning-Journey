package Lesson04_DataCasting;

import java.util.Scanner;

public class L04_Casting {
    public static void main(String[] args) {

// Get two integers from the user
// and divide the 1st number by the 2nd, then print the result of the division

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 2 integers...");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

// If Java divides two integers, the result will also be an integer

// Divide the entered two numbers
// and print the result as a decimal

        double result = num1 / num2;

        System.out.println("If we assign the result to a double variable: " + result);

        double result2 = (double) num1 / num2;

        System.out.println("If we cast num1 to double: " + result2);


    }
}
