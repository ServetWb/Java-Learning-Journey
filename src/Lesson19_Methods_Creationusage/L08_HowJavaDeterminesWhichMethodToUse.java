package Lesson19_Methods_Creationusage;

public class L08_HowJavaDeterminesWhichMethodToUse {
    public static void main(String[] args) {

        add(3, 4); // add(int, int)
        // Sum of two ints: 7

        add(2.1, 3.2); // add(double, double)
        // Sum of two doubles: 5.300000000000001

        add(2, 3.4); // add(int, double)
        // Sum of two doubles: 5.4

        add(5.3, 4); // add(double, int)
        // Sum of two doubles: 9.3

        add('a', 'b'); // add(char, char) → treated as int
        // Sum of two ints: 195

        // add(5, true);
        // If the provided arguments do not match any method signature,
        // Java gives a Compile Time Error (CTE)
    }

    public static void add(int a, int b) { // add(int, int)
        System.out.println("Sum of two ints: " + (a + b));
    }

    public static void add(double a, double b) { // add(double, double)
        System.out.println("Sum of two doubles: " + (a + b));
    }
}