package Lesson25_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class L05_CreateArrayFromUserInput {

    // Create a method that asks the user for the size of an array
    // and its String elements, then builds and returns the array

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArrayFromUser()));
    }

    public static String[] createArrayFromUser() {

        // To create the array, we first need to get its length

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many elements the array should have:");
        int elementCount = scanner.nextInt();  // e.g., 3

        scanner.nextLine(); // consume the leftover newline character

        String[] arr = new String[elementCount]; // [null, null, null]

        for (int i = 0; i < elementCount; i++) {
            System.out.println("Please enter a text for index " + i + ":");
            arr[i] = scanner.nextLine();
        }

        return arr;
    }
}