package Lesson06_Increment_Decrement;

public class L03_ComparisonOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 25;

        System.out.println(a >= b); // 10 >= 15 → false

        System.out.println(c == a + b); // 25 == 25 → true

        System.out.println(c != b); // 25 != 15 → true

        System.out.println(c = b); // Assigns the value of b to c, and prints c → 15


        // If comparison operators are used with char values,
        // the comparison is made based on their ASCII values.
        // - Lowercase letters always have higher ASCII values than uppercase letters.
        // - Even if we don't know the ASCII values, we can think in terms of:
        //   characters that come earlier alphabetically have smaller ASCII values for '<',
        //   and characters that come later have larger values for '>'.


        System.out.println('f' > 'c');  // 102 > 99 → true

        System.out.println('B' < 'z');  // 66 < 122 → true

        System.out.println('q' != 'q'); // 'q' is equal to 'q' → false

        System.out.println('m' < 't');  // Is 'm' before 't' in the alphabet? → true
    }
    }
