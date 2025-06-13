package Lesson25_Arrays;

public class L01_SumOfArrayElements {

    public static void main(String[] args) {

        // Given an int array, sum all its elements
        // and print the total value

        int[] numbers = {3, 5, 7, 1, 2, 4};

        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        System.out.println("Sum of the elements in the array: " + total);
    }

    // Create a method that takes an int array,
    // sums all its elements, and prints the total

    public static void printSumOfElements(int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        System.out.println("Sum of the elements in the array: " + total);
    }

    // Create a method that takes an int array,
    // sums all its elements, and returns the total value

    public static int getSumOfElements(int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        return total;
    }

}
