package Lesson25_Arrays;

public class L04_SearchElementInArray {
    // Create a method that checks whether a given element exists
    // in a provided int array, and if it does, how many times it appears.

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 4, 2, 6, 2, 5, 2, 8, 1, 9, 2};

        searchElementInArray(arr, 3);   // The number 3 exists 1 time(s) in the array

        searchElementInArray(arr, 2);   // The number 2 exists 5 time(s) in the array

        searchElementInArray(arr, 11);  // The number 11 does NOT exist in the array
    }

    public static void searchElementInArray(int[] arr, int targetNumber) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetNumber) {
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println("The number " + targetNumber + " does NOT exist in the array");
        } else {
            System.out.println("The number " + targetNumber + " exists " + counter + " time(s) in the array");
        }
    }

}
