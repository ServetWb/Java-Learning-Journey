package Lesson05_wrapperclass_math_operations_concatenation;

public class L02_WrapperClass_Important_Notes {

    public static void main(String[] args) {

        int intNumber = 23;
        double doubleNumber = 45.3;

        double a = intNumber; // auto widening
        int b = (int)doubleNumber; // explicit narrowing

// Are auto widening and explicit narrowing also valid for Wrapper Classes?

        Short shortWrapper = 24;
        Integer intWrapper = 34;

// Wrapper Classes are non-primitive data types
// In non-primitive types, casting is only allowed between parent-child class relationships
// Since there is no such relationship between wrapper classes,
// Casting between them is not allowed

// Integer ab = shortWrapper;
// Integer ac = (Integer)shortWrapper; // Inconvertible types; cannot cast 'Short' to 'Integer'
// Short bc = intWrapper;
// Short bd = (Short)intWrapper;

// If you are required to perform casting anyway,
// Assign the value of intWrapper to a Double variable

// First, assign intWrapper to a primitive int variable
        int tempInt = intWrapper;

// Then cast the primitive int variable to a double
        double tempDouble = tempInt;

// Now you can assign it to a Double wrapper variable
        Double wrapperDouble = tempDouble;

        System.out.println("The number cast to Double: " + wrapperDouble); // 34.0



    }
}
