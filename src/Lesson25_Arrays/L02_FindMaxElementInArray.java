package Lesson25_Arrays;

public class L02_FindMaxElementInArray {

    public static void main(String[] args) {
        /*
            If we need to check every element to complete the given task,
            we use a for loop
         */

        // Print the largest element in the given int array

        int[] numbers = {-2, -5, -7, -11, -4};

        int maxElement = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxElement) {
                maxElement = numbers[i];
            }
        }

        System.out.println("The largest element in the array: " + maxElement);
    }

    // Create a method that returns the largest element
    // in a given int array

    public static int getMaxElement(int[] arr) {
        int maxElement = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        return maxElement;
    }
}
