package Lesson25_Arrays;

import Lesson19_Methods_Creationusage.L02_ReturnFactorialValue;

public class L06_RunUtilityMethods {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 13, 12};

        // Print the sum of all elements in the numbers array
        L01_SumOfArrayElements.printSumOfElements(numbers);

        // Sum all the elements in the numbers array
        // If the total is an even number, print "What a nice array"
        // If the total is an odd number, print "I didn't like this array"

        // We cannot use the printSumOfElements() method here
        // because it's void and doesn't return the total
        // int result = C01_SumOfArrayElements.printSumOfElements(numbers); ❌

        int totalResult = L01_SumOfArrayElements.getSumOfElements(numbers);

        if (totalResult % 2 == 0) {
            System.out.println("What a nice array");
        } else {
            System.out.println("I didn't like this array");
        }

        // Find the largest number in the given int array
        // If the number is a positive integer less than 15,
        // print its factorial value
        // Otherwise, print the largest number

        int maxElement = L02_FindMaxElementInArray.getMaxElement(numbers);

        if (maxElement > 0 && maxElement < 15) {
            System.out.println("Factorial of the largest number: " +
                    L02_ReturnFactorialValue.calculateFactorial(maxElement));
        } else {
            System.out.println("The largest number: " + maxElement);
        }
    }
}
