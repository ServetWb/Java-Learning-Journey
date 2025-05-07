package Lesson05_wrapperclass_math_operations_concatenation;

public class L06_Concatenation02 {
    public static void main(String[] args) {

        // Using only the given variables,
// print the required Strings

        String str1 = "Java";
        String space = " ";
        String str2 = "isGreat";
        String empty = "";

        int x = 3;
        int y = 4;

// 34Java
        System.out.println(x + y + str1);             // 7Java
        System.out.println(empty + x + y + str1);     // "3" + 4 ==> "34" + Java ==> "34Java"
        System.out.println(x + empty + y + str1);     // "34Java"

// Java34
        System.out.println(str1 + x + y);             // Java34

// Java7isGreat
        System.out.println(str1 + x + y + str2);        // Java34isGreat
        System.out.println(str1 + (x + y) + str2);      // Java7isGreat

// Java12isGreat
        System.out.println(str1 + x * y + str2);        // 3 * 4 = 12 ==> Java12isGreat

// 12 isGreat
        System.out.println(x * y + space + str2);       // 12 isGreat

// Java 7
        System.out.println(str1 + space + (x + y));     // Java 7

// Java isGreat 34
        System.out.println(str1 + space + str2 + space + x + y); // Java isGreat 34

/*
    You cannot cast primitive data types directly to a String using type casting.
    However, by concatenating with an empty string (""), you can convert anything to a String.
*/

        boolean boolVal = true;
        int num = 4;
        char character = 'r';
        double dblVal = 34.67;

// Invalid direct assignments:
// String s1 = num;
// String s2 = boolVal;
// String s3 = character;
// String s4 = dblVal;

// Invalid type casting:
// String s1 = (String) num;
// String s2 = (String) boolVal;
// String s3 = (String) character;
// String s4 = (String) dblVal;

// Correct way: use concatenation with an empty string
        String string1 = num + "";
        String string2 = "" + boolVal;
        String string3 = character + "";
        String string4 = "" + dblVal;


    }
}
