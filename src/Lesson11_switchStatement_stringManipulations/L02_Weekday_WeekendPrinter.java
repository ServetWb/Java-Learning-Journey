package Lesson11_switchStatement_stringManipulations;

import java.util.Scanner;

public class L02_Weekday_WeekendPrinter {
    public static void main(String[] args) {
// Ask the user to enter a day number
        // According to the entered number: 1 - Monday ..... 7 - Sunday
        // Print whether the given day is a weekday or weekend
        // If the user enters a number outside the range 1-7,
        // display an error message

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the day number...");
        int dayNo = scanner.nextInt();

        switch (dayNo) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day number entered");
        }

    }
}
