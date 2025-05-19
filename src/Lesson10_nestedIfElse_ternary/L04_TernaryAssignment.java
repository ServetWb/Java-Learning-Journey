package Lesson10_nestedIfElse_ternary;

import java.util.Scanner;

public class L04_TernaryAssignment {

    public static void main(String[] args) {

        // Get an integer from the user
        // If the number is greater than 100, decrease its value by 10
        // If the number is not greater than 100, double its value

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        int number = scanner.nextInt();

        if (number > 100) {
            number -= 10;
        } else {
            number *= 2;
        }

        System.out.println("Value after if-else: " + number);

        // Ternary operator used for assignment
        number = number > 100 ? number - 10 : number * 2;

        System.out.println("Value after ternary: " + number);
    }
}