package Lesson04_DataCasting;

public class L01_AutoWidening {

    public static void main(String[] args) {


/*
    In Java, assigning a VALUE of a narrower data type
    to a VARIABLE of a broader data type
    is done automatically,
    and this is called Auto-Widening.
*/

        boolean bl = true;
        char chr = 'a';
        byte byt = 24;
        short shrt = 23;
        int numInt = 30;
        long lng = 40;
        float flt = 3.5F;
        double dbl = 4.5;
        String str = "Java is Life";

// Invalid assignments (won't compile)
// bl = chr;
// bl = numInt;
// bl = str;

// str = bl;
// str = chr;
// str = lng;
// str = dbl;

/*
    You CANNOT assign a value of another data type
    to a variable of boolean or String data type.
    The char data type has a specific behavior that we will study later in detail.
*/

// Invalid narrowing conversions (will cause error)
// byt = shrt;     // 23
// byt = numInt;  // 30
// byt = lng;      // 40
// byt = flt;      // 3.5F
// byt = dbl;      // 4.5

        shrt = byt;

// Invalid assignments (narrowing again)
// shrt = numInt;
// shrt = lng;
// shrt = flt;
// shrt = dbl;

        numInt = byt;
        numInt = shrt;

// Invalid
// numInt = lng;
// numInt = flt;
// numInt = dbl;

        lng = byt;
        lng = shrt;
        lng = numInt;

// Invalid
// lng = flt;
// lng = dbl;

        flt = byt;
        flt = shrt;
        flt = numInt;
        flt = lng;
// Invalid
// flt = dbl;

        dbl = byt;
        dbl = shrt;
        dbl = numInt;
        dbl = lng;
        dbl = flt;

        int num1 = 20;
        int num2 = num1;

/*
    Casting means assigning a value of a different data type to a variable.
    If you assign an int value to an int variable,
    this is not CASTING, it is just ASSIGNMENT.



 */
    }
}
