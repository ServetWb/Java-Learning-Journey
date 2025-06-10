package Lesson22_Scope;

public class L02_LocalVariables {

    // Create a variable that can be used by all methods
    static int number = 23;
// Variables that can be used by all methods can be created at the class level
// class level: inside the class but outside other code blocks

    public static void main(String[] args) {

        System.out.println(number);

        String text;
        // Local variables
        // can be declared without assigning a value
        // but CANNOT be USED without assigning a value
        // System.out.println(text);
    }

    public static void method1() {
        System.out.println(number);
    }

    public void method2() {
        System.out.println(number);
    }
}