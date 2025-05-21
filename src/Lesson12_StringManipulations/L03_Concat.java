package Lesson12_StringManipulations;

public class L03_Concat {


        public static void main(String[] args) {

            String s1 = "java";
            String s2 = " ";
            String s3 = "is beautiful";
            String s4 = "";

            int number1 = 4;
            int number2 = 5;

            // Print the following sentences using only variables:

            // java is beautiful
            System.out.println(s1 + s2 + s3);  // java is beautiful

            System.out.println(s1.concat(s2).concat(s3));  // java is beautiful


            // java 54
            System.out.println(s1 + s2 + number2 + number1);  // java 54

            System.out.println(s1.concat(s2).concat(number2 + s4).concat(number1 + s4));  // java 54
        }
    }


