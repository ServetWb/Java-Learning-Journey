package Lesson11_switchStatement_stringManipulations;

public class L05_ThingsToPayAttentionTo {
    public static void main(String[] args) {

        // In a switch statement, the following types cannot be used:
        // boolean, long, float, and double,
        // as well as their wrapper classes: Boolean, Long, Float, and Double.

        // You can use String and the primitive data types:
        // char, byte, short, int, and their corresponding wrapper classes.

        double dbl = 3;
        boolean bl = true;
        long lng = 5;

        // The code below is commented out because it would cause a compile-time error
        // since 'long' cannot be used in a switch statement.

//        switch (lng) {
//
//            case 3 :
//
//            default:
    }
}
