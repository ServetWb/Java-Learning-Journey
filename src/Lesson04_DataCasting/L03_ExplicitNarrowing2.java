package Lesson04_DataCasting;

public class L03_ExplicitNarrowing2 {
    public static void main(String[] args) {

/*
        If we explicitly force Java to perform casting (type conversion),
        Java may change the value in order to make it compatible with the target data type,
        which can lead to **data loss**.

        For example:
        dbl1 = 74.3;  ==> when cast to int, it becomes 74 — data loss occurs.
        int 260 ==> when cast to byte, it becomes 4 — the data is altered.
*/

        int num1 = 17;
        int num2 = 125;
        int num3 = 134;
        int num4 = 145;
        int num5 = 260;
        int num6 = 520;
        int num7 = 1245621;

        byte b = (byte) num1;
        System.out.println("The value of 17 cast to byte: " + b); // 17

        b = (byte) num2;
        System.out.println("The value of 125 cast to byte: " + b); // 125

        b = (byte) num3;
        System.out.println("The value of 134 cast to byte: " + b); // -122

        b = (byte) num4;
        System.out.println("The value of 145 cast to byte: " + b); // -111

        b = (byte) num5;
        System.out.println("The value of 260 cast to byte: " + b); // 4
// Values that are multiples of 256 wrap around to 0, and this can be used to predict results

        b = (byte) num6;
        System.out.println("The value of 520 cast to byte: " + b); // 8

        b = (byte) num7;
        System.out.println("The value of 1245621 cast to byte: " + b); // -75
    }
}
