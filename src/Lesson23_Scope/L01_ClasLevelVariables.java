package Lesson23_Scope;

public class L01_ClasLevelVariables {
    String instanceString;
    static String staticString = "Ali";
    int instanceNumber = 10;
    static int staticNumber;
    char instanceChar;
    static char staticChar = '#';
    boolean instanceBoolean = true;
    static boolean staticBoolean;

    /*
        Because the main method is static,
        it does NOT ALLOW direct use of non-static variables from the main method.

        If you want to use a non-static variable inside a static method,
        you must create an object from the class that contains the instance variable you want to use.

        Local variables can be declared without assignment,
        BUT they CANNOT be USED before assignment.

        Class level variables, whether static or instance,
        can be declared without assignment and CAN be USED.

        If the programmer does not assign a value to a class level variable,
        Java uses the default (implicit) value.

        Java's default values are as follows:
        For String and all other non-primitive types: null
        For numeric primitives: 0 (byte, short, int, long, float, double)
        For boolean: false
        For char: empty character (Unicode '\u0000')
    */

    public static void main(String[] args) {
        System.out.println("staticString : " + staticString);  // Ali
        System.out.println("staticNumber : " + staticNumber);  // 0
        System.out.println("staticChar : " + staticChar);      // #
        System.out.println("staticBoolean : " + staticBoolean); // false

        // Create an object to access instance variables
        L01_ClasLevelVariables obj = new L01_ClasLevelVariables();

        System.out.println("instanceString : " + obj.instanceString);  // null (default for String)
        System.out.println("instanceNumber : " + obj.instanceNumber);  // 10 (assigned value)
        System.out.println("instanceChar : " + obj.instanceChar);      // empty char (default)
        System.out.println("instanceBoolean : " + obj.instanceBoolean);// true (assigned value)
    }

    public static void method1() {
        System.out.println(staticString);
        System.out.println(staticNumber);
        System.out.println(staticChar);
        System.out.println(staticBoolean);

        // Create an object to access instance variables
        L01_ClasLevelVariables obj1 = new L01_ClasLevelVariables();
        System.out.println(obj1.instanceString);
        System.out.println(obj1.instanceNumber);
        System.out.println(obj1.instanceChar);
        System.out.println(obj1.instanceBoolean);
    }

    public void method2() {
        // Instance method can directly access both static and instance variables
        System.out.println(staticString);
        System.out.println(staticNumber);
        System.out.println(staticChar);
        System.out.println(staticBoolean);

        System.out.println(instanceString);
        System.out.println(instanceNumber);
        System.out.println(instanceChar);
        System.out.println(instanceBoolean);
    }
}