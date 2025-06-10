package Lesson22_Scope;

public class L03_ClassLevelVariables {

    /*
    The scope of variables created at the class level is the ENTIRE CLASS,
    meaning we can use these variables from anywhere within the class.

    HOWEVER, whether or not the static keyword is used when defining
    class-level variables changes how we can access them inside the class.

    Variables that are not declared with the static keyword are called *instance variables*.

    NOTE: You CANNOT use the static keyword with local variables.

    IF a variable is static, it can be accessed directly from any method.
    Variables like strS, numberS, charS, and boolS can be used from both static and non-static methods.

    BUT if a variable is not static,
    then the choice belongs to the method:
    If the method is static, it does NOT allow any non-static variable or method inside its body.
    In main method and method1, we CANNOT access strI, numberI, charI, boolI.

    Non-static methods have no such restriction;
    they can access all variables, static or non-static.
*/

    String strI;
    static String strS = "Ali";
    int numberI = 10;
    static int numberS;
    char charI;
    static char charS = '#';
    boolean boolI = true;
    static boolean boolS;

    public static void main(String[] args) {
//        System.out.println(
//               strS + " " + strI + " " + numberS + " " + numberI + " " + charS + " " + charI
//               + " " + boolS + " " + boolI
//        );
        method1();
        // method2(); // Since main is static, it doesn't allow non-static method2 inside its scope
    }

    public static void method1(){
//        System.out.println(
//               strS + " " + strI + " " + numberS + " " + numberI + " " + charS + " " + charI
//               + " " + boolS + " " + boolI
//        );
        // method2(); // Since method1 is static, it doesn't allow non-static method2 inside its scope
    }

    public void method2(){
        System.out.println(
                strS + " " + strI + " " + numberS + " " + numberI + " " + charS + " " + charI
                        + " " + boolS + " " + boolI
        );
        method1();
    }

}
