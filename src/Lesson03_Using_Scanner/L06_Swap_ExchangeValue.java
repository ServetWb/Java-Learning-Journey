package Lesson03_Using_Scanner;

import java.util.Scanner;

public class L06_Swap_ExchangeValue {

    public static void main(String[] args) {

        // Get two numbers from the user and swap their values.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first integer...");
        int number1 = scanner.nextInt();

        System.out.println("Please enter the second integer...");
        int number2 = scanner.nextInt();

        int temp = 0;

        temp = number2;

        number2 = number1;

        number1 = temp;

        System.out.println("I have swapped the numbers, \nnumber1: " + number1 + ", number2: " + number2);

        // Swap the values of the variables without using a temporary variable
    }
    }


