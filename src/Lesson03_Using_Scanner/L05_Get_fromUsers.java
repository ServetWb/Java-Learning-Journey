package Lesson03_Using_Scanner;

import java.util.Scanner;

public class L05_Get_fromUsers {


    public static void main(String[] args) {


        // Get the user's first name, last name, and age, then print the information in the following format:
//      entered information: J Doe, 44

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name...");
        char firstInitial = scanner.nextLine().toUpperCase().charAt(0);

/*
    If you want to get a text value from the user,
    you can use either scanner.next() or scanner.nextLine().
    There is only one key difference between the two:

    scanner.next(): Even if the user enters multiple words,
                    it only reads the first word (up to the first space).

    scanner.nextLine(): Reads the entire line including all words and spaces.

    IF you want to get a SINGLE character from the user,
    since there is no scanner.nextChar(),
    you can read the whole line using scanner.nextLine()
    and then extract the first character using charAt(0).

    IMPORTANT NOTE:
    If you will take multiple text inputs from the user,
    it is recommended to use scanner.nextLine() for all.
    If you use scanner.next() first and then scanner.nextLine(),
    you might run into input issues.
*/

        System.out.println("Please enter your last name...");
        String lastName = scanner.nextLine();

        System.out.println("Please enter your age...");
        int age = scanner.nextInt();

        System.out.println("Entered information: " + firstInitial + " " + lastName + ", " + age);
    }
}