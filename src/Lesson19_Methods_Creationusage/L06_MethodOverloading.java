package Lesson19_Methods_Creationusage;

public class L06_MethodOverloading {
    public static void main(String[] args) {


        String str = "Java makes everything possible";

        System.out.println(str.substring(10)); // erything possible

        System.out.println(str.substring(2, 7)); // va ma

        /*
            There can be methods with the same name but different behavior.
            Java decides which method to use based on the arguments provided.

            For example:
            - On line 11, a single argument is passed,
              so the substring() method that matches one parameter is executed.
            - On line 14, two arguments are passed,
              so a different substring() method that accepts two parameters is executed.
         */
    }
}