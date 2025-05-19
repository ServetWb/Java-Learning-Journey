package Lesson10_nestedIfElse_ternary;

public class L07_TernaryImportantNotes {

    public static void main(String[] args) {

        int number = 17;

        // 1- Ternary MUST ALWAYS PRODUCE A RESULT
        //    You MUST either PRINT this result or ASSIGN it to a variable.
        //    If you just write the ternary operator by itself, Java will throw an error.

        // number > 20 ? number + 10 : number - 10;

        System.out.println(number > 20 ? number + 10 : number - 10);

        number = number > 20 ? number + 10 : number - 10;

        int b = number > 20 ? number + 10 : number - 10;


        // 2- If we are going to PRINT the result of a ternary expression,
        //    the data type of the true or false outcomes does NOT matter.
        //    BUT, if we are going to ASSIGN the result to a variable,
        //    the data types of both the true and false outcomes MUST match.

        number = 26;

        // Check the given number
        // If it is even, print "Number is even"
        // If it is not even, print the number plus 10

        System.out.println(number % 2 == 0 ? "Number is even" : number + 10);


        // Save the result of the same ternary into a variable

        // int result = number % 2 == 0 ? "Number is even" : number + 10;  // ❌ Invalid: types don't match

        // String result = number % 2 == 0 ? "Number is even" : number + 10; // ❌ Also problematic without conversion
    }

}
