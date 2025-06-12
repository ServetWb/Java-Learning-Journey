package Lesson23_Scope;

public class L02_UsingFromAnotherClass {

     /*
        Local variables cannot be USED outside the code block in which they are created.

        Class-level variables can be used anywhere within the class they are created in,
        and they CAN ALSO BE USED from another class.

        HOWEVER, the `static` keyword also determines the way we access them.

        If class members (variable/method) are static
        and will be used from another class,
        they can be accessed using: ClassName.staticClassMemberName

        To use instance variables or non-static methods,
        we need to create an object again.

        Static class members can also be used through an object,
        BUT in that case, Java highlights the code in yellow saying:
        “Why are you accessing a static class member
        via an instance reference?”
     */

    public static void main(String[] args) {

        // Accessing static variables directly from another class using class name
        System.out.println(L01_ClasLevelVariables.staticString); // prints the static String variable
        System.out.println(L01_ClasLevelVariables.staticNumber); // prints the static int variable
        L01_ClasLevelVariables.method1(); // calls the static method

        // To access non-static (instance) variables or methods, we create an object
        L01_ClasLevelVariables obj = new L01_ClasLevelVariables();
        System.out.println(obj.instanceBoolean); // prints the instance boolean variable
        obj.method2(); // calls the instance method

        // Although it's allowed to access static members via an object, it's not recommended
        System.out.println(obj.staticBoolean);
        // Warning: Static member 'blS' accessed via instance reference

        obj.method1();
        // Warning: Static method 'method1()' accessed via instance reference
    }
}


