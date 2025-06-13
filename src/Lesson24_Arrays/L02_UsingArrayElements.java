package Lesson24_Arrays;

import java.util.Arrays;

public class L02_UsingArrayElements {
    public static void main(String[] args) {

        int[] numbers = {3, 7, 9, 12, 54, 16, 89};

        // Print the first number in the numbers array, which is 3
        System.out.println(numbers[0]); // 3

        // Update the value 9 in the array to 29
        numbers[2] = 29;

        System.out.println(numbers[2]); // 29

        // Print all elements in the array side by side

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // {3, 7, 9, 12, 54, 16, 89}
        // Suppose we want to add a new element to the numbers array
        // Add the value 20 at index 7

        // numbers[7] = 20; // ArrayIndexOutOfBoundsException

        // The length of an array cannot be changed after it is created
        // We cannot add a new element to an array later
        // or remove an existing one

        // Try to print the array directly

        System.out.println(numbers); // [I@6bf256fa

        // If you try to print an array directly,
        // Java will print the reference of the array

        // To print an array properly, use a built-in method from the Arrays class

        System.out.println(Arrays.toString(numbers)); // [3, 7, 29, 12, 54, 16, 89]
    }
}
