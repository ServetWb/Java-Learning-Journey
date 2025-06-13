package Lesson25_Arrays;

    public class L03_SumOfPositiveNumbers {

        // Write a method that takes an int array and
        // returns the sum of the positive integers in it.

        public static void main(String[] args) {

            // int[] arr = {1, -3, 4, -5, 2, -7};
            // System.out.println(getSumOfPositiveElements(arr));
            // In the given task, we are only required to create the method.
            // Our job ends once we define the method.

            // It is not necessary to create a main method,
            // create an array inside it, or test the method
            // if that is not part of the task.

            // However, to verify that our code works correctly,
            // we may create a main method and test it.
            // But since it's not requested, it's best practice
            // to delete the main method and the test afterward.
        }

        public static int getSumOfPositiveElements(int[] arr) {
            int total = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    total += arr[i];
                }
            }

            return total;
        }
    }
