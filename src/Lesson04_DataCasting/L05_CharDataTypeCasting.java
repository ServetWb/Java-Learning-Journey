package Lesson04_DataCasting;

public class L05_CharDataTypeCasting {
    public static void main(String[] args) {

        /*
            The char data type uses codes from the ASCII table.
            Since every char character has a mathematical equivalent,

            If the char data type is used in a mathematical operation,
            it will participate in the operation using its numeric ASCII value.

            With this feature, the char data type
            can be associated with the int data type.

            And since it can store the characters that make up a text,
            it can also be associated with String.
         */

        boolean bl = true;
        char chr = 'a';
        byte byt = 24;
        short shrt = 23;
        int intNum = 30;
        long lng = 40;
        float flt = 3.5F;
        double dbl = 4.5;
        String str = "Java is Life";

        // chr = bl;
        // chr = (char)bl;

        // chr = str;
        // chr = (char)str;

        chr = (char)byt;
        chr = (char)shrt;
        chr = (char)intNum;
        chr = (char)lng;
        chr = (char)flt;
        chr = (char)dbl;

        byt = (byte)chr;
        shrt = (short)chr;
        intNum = chr;
        lng = chr;
        flt = chr;
        dbl = chr;

        char chr1 = 'a';
        char chr2 = 'b';

        System.out.println(chr1 + chr2); // 97 + 98 ==> 195

        System.out.println('H' > 'C'); // 72 > 67 ==> true

        System.out.println('b' > 'B'); // 98 > 66 ==> true

        // Print the 3 characters that come after a given char character
        // Example: if input = 'm' then output => n o p

        char givenChar = 'K';

        System.out.println((char)(givenChar + 1));
        System.out.println((char)(givenChar + 2));
        System.out.println((char)(givenChar + 3));
    }
}
