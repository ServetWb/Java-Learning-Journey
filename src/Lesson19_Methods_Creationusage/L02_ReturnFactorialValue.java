package Lesson19_Methods_Creationusage;

public class L02_ReturnFactorialValue {

    public static void main(String[] args) {

//        System.out.println(calculateFactorial(3)); // 6
//        System.out.println(calculateFactorial(5)); // 120
        // Since the task doesn't require us to verify whether the method works,
        // there is no need to keep lines 7 and 8.
        // We can write such trial runs to check the code functionality,
        // but once confirmed, it's better to remove those test lines for clean code.
    }

    // Create a method that calculates and returns the factorial
    // of a given positive integer less than 17

    public static int calculateFactorial(int number) {

        int factorial = 1;

        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }

        return factorial;
    }
}
