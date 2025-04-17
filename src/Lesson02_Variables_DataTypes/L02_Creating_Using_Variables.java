package Lesson02_Variables_DataTypes;

public class L02_Creating_Using_Variables {
    public static void main(String[] args) {

        int number = 10;

        System.out.println("6.the value of the number int the line : " + number);
        //  8.the value of the number int the line : 10

        // let's assing a new value to the number variable

        // int number= 50;
        // variable 'number' is already defined in the scope
        // we can't create the value we have already created again

        number = 50;

        System.out.println("17.the value of the number int the line : " + number);

        /*

        in Java ' = ' is the assignment operator
        when java sees =, it first looks to the right of the '=' performs
        the operation on the right, and then assigns the resulting value to the variable
         */
        number = number + 10;

        System.out.println("27.the value of the number int the line : " + number);
        // "17.the value of the number int the line 60

        int a = 5;
        a = 2 * a + 1;

        System.out.println("a's value " + a ); // 11


    }
}
