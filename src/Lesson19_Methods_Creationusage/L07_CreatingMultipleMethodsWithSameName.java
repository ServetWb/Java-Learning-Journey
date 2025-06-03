package Lesson19_Methods_Creationusage;

public class L07_CreatingMultipleMethodsWithSameName {

      /*
        1- In a class, you CANNOT create multiple methods that are completely identical.

        2- Changing the names of the variables used as parameters
           DOES NOT make methods different.

        3- Java defines a method by its method SIGNATURE.
           In Java, method signature = method name + the order of parameter data types.

        4- To create multiple methods with the same name in a class,
           we need to make their signatures different.

        5- Creating multiple methods with the same name
           but different signatures in the same class
           is called OVERLOADING.

           In other words:

           Overloading means creating methods with the same name
           but different signatures within the same class.
     */

    public static void main(String[] args) {

        add(4, 5);
    }

    // Can we create multiple methods with the same name in a class?

    public static void add(int num1, int num2) { // add(int, int)
        System.out.println("Sum of two ints: " + (num1 + num2));
    }

    // Duplicate signature – not allowed
//    public static void add(int a, int b) { // add(int, int)
//        System.out.println("Sum of two ints: " + (a + b));
//    }

    public static void add(int a) { // add(int)
        System.out.println("Sum of one int with itself: " + (a + a));
    }

    public static void add(int a, int b, int c) { // add(int, int, int)
        System.out.println("Sum of three ints: " + (a + b + c));
    }

    public static void add(int a, double b) { // add(int, double)
        System.out.println("Sum of int and double: " + (a + b));
    }

    public static void add(double a, int b) { // add(double, int)
        System.out.println("Sum of double and int: " + (a + b));
    }

    public static void add(double a, double b) { // add(double, double)
        System.out.println("Sum of two doubles: " + (a + b));

    }
}