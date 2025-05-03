package Lesson03_Using_Scanner;

import java.util.Scanner;

public class L03_User_input_Scanner {

    // Get the user's first name, last name, and age, then print them in the following format :
    //      First name: John
    //      Last name: Doe
    //      Age: 44
    //      Your registration has been completed successfully.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name...");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your last name...");
        String lastName = scanner.nextLine();

        System.out.println("Please enter your age...");
        int age = scanner.nextInt();

        System.out.println(
                "First name: " + firstName +
                        "\nLast name: " + lastName +
                        "\nAge: " + age +
                        "\nYour registration has been completed successfully.");
    }
    }



