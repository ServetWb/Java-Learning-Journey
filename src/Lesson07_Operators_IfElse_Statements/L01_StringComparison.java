package Lesson07_Operators_IfElse_Statements;

public class L01_StringComparison {

    public static void main(String[] args) {

        String s1 = "Ali";
        String s2 = "Ali";
        String s3 = "A" + "l" + "i";
        String s4 = "A";
        String s5 = "li";
        String s6 = s4 + s5;  // Ali
        String s7 = new String("Ali");

        System.out.println( s1 == s2 ); // Ali == Ali ==> true
        System.out.println( s1 == s3 ); // Ali == Ali ==> true
        System.out.println( s1 == s6 ); // Ali == Ali ==> false
        System.out.println( s1 == s7 ); // Ali == Ali ==> false
        System.out.println( s1 == "Ali" ); // Ali == Ali ==> true

        /*
         FOR NOW, we will NOT use '==' to compare Strings

         '==' checks both the text value and the reference
         Therefore, even if the texts are the same,
         some comparisons may return false
         (We will explain this later in the topic of the String Pool)

         If we want to check whether two Strings have the same **text content**,
         we should use equals()

         equals() ONLY checks the text content
         If the texts are the same, it returns true
         If the texts are different, it returns false
         Differences in characters or case sensitivity
         will result in false
         */
        System.out.println("==================");
        System.out.println( s1.equals(s2) ); // "Ali" equals "Ali" ==> true
        System.out.println( s1.equals(s3) ); // "Ali" equals "Ali" ==> true
        System.out.println( s1.equals(s6) ); // "Ali" equals "Ali" ==> true
        System.out.println( s1.equals(s7) ); // "Ali" equals "Ali" ==> true
        System.out.println( s1.equals("Ali") ); // "Ali" equals "Ali" ==> true

        System.out.println( s1.equals("ali") ); // "Ali" equals "ali" ==> false
        System.out.println( s1.equals("ALI") ); // "Ali" equals "ALI" ==> false
        System.out.println( s1.equals("ALi") ); // "Ali" equals "ALi" ==> false
        System.out.println( s1.equals("Ali ") ); // "Ali" equals "Ali " ==> false
        System.out.println( s1.equals("Alo") ); // "Ali" equals "Alo" ==> fal
    }
}
