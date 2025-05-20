package Lesson11_switchStatement_stringManipulations;

import java.util.Scanner;

public class L01_PrintDayName {

    // Ask the user to enter a day number
    // According to the entered number, print the day name: 1 - Monday ..... 7 - Sunday
    // If the user enters a number outside the range 1-7,
    // display an error message

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the day number...");
        int dayNo = scanner.nextInt();

        if (dayNo == 1) {
            System.out.println("Monday");
        } else if (dayNo == 2) {
            System.out.println("Tuesday");
        } else if (dayNo == 3) {
            System.out.println("Wednesday");
        } else if (dayNo == 4) {
            System.out.println("Thursday");
        } else if (dayNo == 5) {
            System.out.println("Friday");
        } else if (dayNo == 6) {
            System.out.println("Saturday");
        } else if (dayNo == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day number entered");
        }

        System.out.println("=================");

        // Let's do the same operation using switch

        switch (dayNo) { // change the code to execute based on the value of dayNo

            case 1:   // code to execute when dayNo is 1
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday"); // cases don't have to be a single line
                // you can build menu structures and write more complex code in cases
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: // similar to the final else in if-else-if chains
                System.out.println("Invalid day number entered");

        }

        /*
            The variable written in the parentheses of switch is used
            to determine which case to start executing from.
            If it sees a break statement, it stops.
            If it does not see a break, it continues executing all remaining code and comments
             until the end of the switch statement.
        */


    }
}