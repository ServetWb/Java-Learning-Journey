package Lesson22_Scope;

public class L01_LocalVariables {

    public static void main(String[] args) {
    /*
        Variables created within a code block are called LOCAL VARIABLES.
        1- Local variables can only be used within the code block where they are created.
        2- You CANNOT declare two variables with the same name in the same code block.
           Different code blocks can have variables with the same name;
           each variable is valid only within its own code block.
        3- Loops also have their own scopes { },
           and the scope of a variable created inside a loop
           is between the loop’s { }, and it cannot be used outside the loop.
        4- Variables created inside the main method
           can also be used inside loops created within the main method.
    */

        int mainNumber = 23;

        int number = 10;
        // int number = 23; // Variable 'number' is already defined in the scope

        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
            String message = "Java is life";
            System.out.println(message);
            System.out.println(number);
            System.out.println(mainNumber);
        }

        // System.out.println(i);
        // System.out.println(message);
    }


    public static void exampleMethod1() {
        // System.out.println(mainNumber);
        int number = 45;
    }


    public void exampleMethod2() {
        // System.out.println(mainNumber);
        int number = 50;
    }

}
