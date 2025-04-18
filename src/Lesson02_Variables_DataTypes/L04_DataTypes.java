package Lesson02_Variables_DataTypes;

public class L04_DataTypes {
    public static void main(String[] args) {

        boolean bl1 = true;
        boolean bl2 = false;

// boolean bl3 = "true"; // In Java, anything inside double quotes is treated as a String

        char chr1 = 'e';
        char chr2 = '5';
        char chr3 = '$';
// char chr4 = 'a '; // Too many characters in character literal
        // A char can only hold a single character

        char chr5 = ' ';
// char chr6 = "s"; // char uses single quotes ''

        byte byt1 = 20;      // occupies 8 bits in memory
        short shr1 = 20;     // occupies 16 bits in memory
        int sayi1 = 20;      // occupies 32 bits in memory
        long lng1 = 20;      // occupies 64 bits in memory

        int sayi2 = -1987654321;  // occupies 32 bits in memory
        int sayi3 = -234567;      // occupies 32 bits in memory
        int sayi4 = 0;            // occupies 32 bits in memory
        int sayi5 = 45678910;     // occupies 32 bits in memory

        float fl1 = 4.6f;
        float fl2 = 5678.8765F;

        double dbl1 = 34.678;
        double dbl2 = 45;

        float fl3 = 20;
        float fl4 = 3;

        System.out.println(fl3 / fl4);  // 6.666666666666666... => float holds 6 to 7 decimal digits

        double dbl3 = 20;
        double dbl4 = 3;

        System.out.println(dbl3 / dbl4); // 6.666666666666667 => double holds 15 to 16 decimal digits

        String str1 = "Java is Awesome";

        System.out.println(str1.toLowerCase()); // java is awesome

        System.out.println(str1.toUpperCase()); // JAVA IS AWESOME

        int num8 = 66;

/*
    Variables with non-primitive data types
    contain not only the value but also built-in methods.

    However, variables with primitive data types
    only contain the value, no built-in methods.

 */
    }
}
