package Lesson18_Methods_Creationusage;

public class L01_MethodCreation {
    public static void main(String[] args) {


    // Create a method that prints the smaller or equal of two given numbers

    int number1 = 40;
    int number2 = 40;

    printSmallerOrEqual(34, 25);
    printSmallerOrEqual(number1, number2);
}

public static void printSmallerOrEqual(int a, int b) {

    // If a > b, print b (smaller one); otherwise print a
    System.out.println(a > b ? b : a);
}
}

