package Lesson05_wrapperclass_math_operations_concatenation;

public class L01_WrapperClasses {
    public static void main(String[] args) {
/*

        Primitive data types:
        boolean,char,byte,short,int,long,float,double
        Wrapper Classes:
        Boolean, Character, Byte, Short, Integer, Long, Float, Double
                * /

 */

// 1- Variables created from the same data type (primitive and wrapper class)
//    can be directly assigned to each other

        int intNumber = 10;
        Integer wrapperIntNumber = intNumber;

        wrapperIntNumber = 40;
        intNumber = wrapperIntNumber;

// 2- Since wrapper classes are non-primitive, they come with built-in methods

// Converting a number given as a String into a data type that supports mathematical operations

        String price1 = "9.94";
        String price2 = "21.74";
        String price3 = "14.86";

// Find the average of the above 3 prices given as Strings

        System.out.println(price1 + price2 + price3); // 9.9421.7414.86 (string concatenation)

        double price1Double = Double.parseDouble(price1);
        double price2Double = Double.parseDouble(price2);
        double price3Double = Double.parseDouble(price3);

        System.out.println("Average price: " + (price1Double + price2Double + price3Double) / 3);

// Print the maximum value that an int data type can hold
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Short.MIN_VALUE);   // -32768
        System.out.println(Double.MAX_VALUE);  // 1.7976931348623157E308

        char chr = 'a';

// Print true if the given char value is an uppercase letter, false otherwise
        System.out.println(Character.isUpperCase(chr)); // false

// Print true if the given char value is a digit, false otherwise
        System.out.println(Character.isDigit(chr)); // false

// Print true if the given char value is a letter, false otherwise
        System.out.println(Character.isLetter(chr)); // true
        System.out.println(Character.isAlphabetic(chr)); // true

        String str = "Java is Life";

// Print the string in uppercase letters
        System.out.println(str.toUpperCase()); // JAVA IS LIFE

        chr = 'c';

// Print the value of the char variable in uppercase
        System.out.println(Character.toUpperCase(chr)); // C

    }
}