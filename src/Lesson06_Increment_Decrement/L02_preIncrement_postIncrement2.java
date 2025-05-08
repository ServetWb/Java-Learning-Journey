package Lesson06_Increment_Decrement;

public class L02_preIncrement_postIncrement2 {

    public static void main(String[] args) {

        // 1st possibility: When the increment/decrement operation is on the same line as a print operation

        int a = 20;
        int b = 40;

        System.out.println(a++); // 20 → Post-increment: print first, then increment

        System.out.println("Line 16 - value of a: " + a); // 21 → 'a' is now incremented

        a = 20;

        System.out.println(++a); // 21 → Pre-increment: increment first, then print

        System.out.println("Line 24 - value of a: " + a); // 21 → 'a' remains incremented

        b = 40;

        System.out.println(b--); // 40 → Post-decrement: print first, then decrement

        System.out.println("Line 30 - value of b: " + b); // 39 → 'b' is now decremented

        b = 40;

        System.out.println(--b); // 39 → Pre-decrement: decrement first, then print

        System.out.println("Line 37 - value of b: " + b); // 39 → 'b' remains decremented


// 2nd possibility: When the increment/decrement operation is on the same line as an assignment

        a = 20;

        int c = a++; // Post-increment: 'c' gets old value of 'a', then 'a' is incremented

        System.out.println("Line 47 - value of a: " + a + ", c: " + c);
// Output: a = 21, c = 20

        a = 20;

        c = ++a; // Pre-increment: 'a' is incremented first, then assigned to 'c'

        System.out.println("Line 57 - value of a: " + a + ", c: " + c);
// Output: a = 21, c = 21

        b = 40;

        c = b--; // Post-decrement: 'c' gets old value of 'b', then 'b' is decremented

        System.out.println("Line 66 - value of b: " + b + ", c: " + c);
// Output: b = 39, c = 40

        b = 40;

        c = --b; // Pre-decrement: 'b' is decremented first, then assigned to 'c'

        System.out.println("Line 75 - value of b: " + b + ", c: " + c);
// Output: b = 39, c = 39


// 3rd possibility: When the increment/decrement operation is part of a mathematical expression

        a = 20;

        c = 2 * a++ - 3;
// Post-increment: Use 'a' as 20 in expression → 2*20 - 3 = 40 - 3 = 37
// Then increment 'a'

        System.out.println("Line 88 - value of a: " + a + ", c: " + c);
// Output: a = 21, c = 37

        a = 20;

        c = ++a + 20;
// Pre-increment: Increment 'a' first to 21, then calculate → 21 + 20 = 41

        System.out.println("Line 99 - value of a: " + a + ", c: " + c);
// Output: a = 21, c = 41

        b = 40;

        c = 3 * (b-- - 2);
// Post-decrement: Use 'b' as 40 → (40 - 2) = 38 → 3*38 = 114
// Then decrement 'b'

        System.out.println("Line 109 - value of b: " + b + ", c: " + c);
// Output: b = 39, c = 114

        b = 40;

        c = 2 * --b + 3;
// Pre-decrement: Decrement 'b' first to 39 → 2*39 + 3 = 78 + 3 = 81

        System.out.println("Line 109 - value of b: " + b + ", c: " + c);

              // Output: b = 39, c = 81
    }
}
