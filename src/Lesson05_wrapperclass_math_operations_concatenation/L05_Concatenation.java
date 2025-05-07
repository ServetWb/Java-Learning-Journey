package Lesson05_wrapperclass_math_operations_concatenation;

public class L05_Concatenation {
    public static void main(String[] args) {

        // Java allows us to use the + operator with Strings
// However, when + is used with a String,
// it means CONCATENATION, not ADDITION

        System.out.println("Java" + true);     // "Javatrue"

        System.out.println("Java" + '4');      // "Java4"

        System.out.println("Java" + 65.765);   // "Java65.765"

// The + operator can be used with Strings
// but it is not used in a mathematical sense
// -, *, / operators CANNOT be used with Strings

// System.out.println("Java" - "Ali");     // Operator '-' cannot be applied to 'String', 'String'
// System.out.println("Java" * 5);         // Operator '*' cannot be applied to 'String', 'int'
// System.out.println("Java" / true);      // Operator '/' cannot be applied to 'String', 'boolean

    }
}
