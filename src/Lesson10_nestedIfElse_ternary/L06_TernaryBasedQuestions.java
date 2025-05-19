package Lesson10_nestedIfElse_ternary;

public class L06_TernaryBasedQuestions {
    public static void main(String[] args) {

        // Check a given grade
        // If it is 50 or higher, print "You passed the class"
        // If it is less than 50, print "Unfortunately, you failed"

        int grade = 49;

        System.out.println(grade >= 50 ? "You passed the class" : "Unfortunately, you failed");


        // Print the smaller of two given integers

        int number1 = 980;
        int number2 = 980;

        System.out.println(number1 > number2 ? number2 : number1);


        // For a given number
        // Print whether it is a multiple of 3 or not

        int number = 1765;

        System.out.println(number % 3 == 0 ? "Multiple of 3" : "Not a multiple of 3");
    }
}