package Lesson13_StringManipulations_continued;

public class L07_NullPointer {

    public static void main(String[] args) {

        String student1 = "Michael";
        String student4;

        System.out.println(student1);

        // System.out.println(student4);
        // In Java, inside a method, we can declare a variable without assigning a value,
        // BUT we CANNOT use that variable without initializing it first.

        String student5 = "";
        System.out.println(student5); // prints an empty line

        // Assigning "" is a good solution to print something without errors,
        // BUT in this case, student5 is considered as having a name assigned.
        // Java does not care what the value is,
        // as long as a value is assigned, it considers the variable initialized.

        /*
           For non-primitive variables,
           Java provides a special value called 'null'
           which means the variable is declared but intentionally left without a value.

           IMPORTANT NOTE:
           Variables marked as null
           can ONLY be printed safely.
           If you try to perform any operation on them (other than printing),
           Java will throw a NullPointerException.
         */

        String student6 = null;

        // int number = null;  // not allowed because primitive types cannot be null
        Integer number2 = null;  // Wrapper classes can be assigned null

        System.out.println(student6); // prints: null

        System.out.println("Student6's name: " + student6); // prints: Student6's name: null

        System.out.println(student6.toUpperCase()); // This line throws NullPointerException
    }
}
