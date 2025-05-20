package Lesson11_switchStatement_stringManipulations;

import java.util.Scanner;

public class L04_PrintPositiveNumberLessThanHundred {
    public static void main(String[] args) {

        // Ask the user to enter a positive integer less than 100
        // Print the entered number in words
        // Example input: 17 , output: Seventeen
        // If the user enters a number outside the 0-99 range, show an error message

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer less than 100...");
        int number = scanner.nextInt();
        String message = "";

        // 17  ==> tens digit is 1 ==> Ten and units digit is 7 ==> Seventeen
        // 54  ==> tens digit is 5 ==> Fifty and units digit is 4 ==> Fiftyfour

        int unitsDigit = number % 10;
        int tensDigit = number / 10;

        if (number <= 0 || number >= 100) {
            System.out.println("The entered number must be a positive integer less than 100");
        } else { // this is the region for two-digit positive numbers

            // First, convert the tens digit to words
            switch (tensDigit) {
                case 0:
                    break;
                case 1:
                    message = "Ten";
                    break;
                case 2:
                    message = "Twenty";
                    break;
                case 3:
                    message = "Thirty";
                    break;
                case 4:
                    message = "Forty";
                    break;
                case 5:
                    message = "Fifty";
                    break;
                case 6:
                    message = "Sixty";
                    break;
                case 7:
                    message = "Seventy";
                    break;
                case 8:
                    message = "Eighty";
                    break;
                case 9:
                    message = "Ninety";
            }

            // Then add the units digit word to the tens part

            switch (unitsDigit) {
                case 0:
                    break;
                case 1:
                    message += "one";
                    break;
                case 2:
                    message += "two";
                    break;
                case 3:
                    message += "three";
                    break;
                case 4:
                    message += "four";
                    break;
                case 5:
                    message += "five";
                    break;
                case 6:
                    message += "six";
                    break;
                case 7:
                    message += "seven";
                    break;
                case 8:
                    message += "eight";
                    break;
                case 9:
                    message += "nine";
            }
        }

        System.out.println(message);
    }
}
