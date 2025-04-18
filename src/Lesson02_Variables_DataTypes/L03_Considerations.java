package Lesson02_Variables_DataTypes;

public class L03_Considerations {
    public static void main(String[] args) {

        // 1-
        // A variable can be declared only once,

        // but we can assign it a new value as many times as we want.

        int b = 20;

        // int b = 30; // b is already declared

        // String b = "Java is awesome"; // Variable 'b' is already defined in the scope

        b = 25;

        b = b + 10;

        b = 2 * b - 3;

        // 2- On the left-hand side of the assignment operator (=),

        // there must be ONLY a variable.

        int number = 20;

        // 10 = int c; // Not valid

        number = number + 5;

        // number + 10 = number; // Not valid

        // 3- A variable can be declared without being assigned a value,

        // but we CANNOT USE the variable before assigning it a value.

        int age;

        // System.out.println(age);

        // Variable 'age' might not have been initialized

        // The variable 'age' may not have been assigned a value

        age = 29;

        System.out.println(age);


        // 4- In Java, = is the assignment operator

        // When Java sees =, it first looks at the right-hand side

        // It evaluates the expression on the right-hand side,

        // and then assigns the resulting value to the variable on the left.
    }
}
