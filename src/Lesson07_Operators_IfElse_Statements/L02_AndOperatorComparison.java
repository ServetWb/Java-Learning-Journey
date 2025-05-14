package Lesson07_Operators_IfElse_Statements;

public class L02_AndOperatorComparison {

    public static void main(String[] args) {

            /*
            We can choose between using & or && based on the following note:

            If we are **result-oriented**
            and want to reach the result as quickly as possible, use **&&**

            If we are **process-oriented**
            and want to check **all comparisons without skipping**, use **&**
         */

        int a = 10;
        int b = 20;

        boolean result1 = true;
        boolean result2 = true;
        boolean result3 = true;

        // Using single & operator: all expressions are evaluated regardless of previous results
        boolean overallResult =  (result1 = a >= b) & (result2 = a < b) & (result3 = a > b - 8);

        System.out.println("& result1: " + result1);
        System.out.println("& result2: " + result2);
        System.out.println("& result3: " + result3);
        System.out.println("& overallResult: " + overallResult);

        boolean result4 = true;
        boolean result5 = true;
        boolean result6 = true;

        // Using short-circuit && operator: evaluation stops as soon as one condition is false
        boolean overallResult2 = (result4 = a >= b) && (result5 = a < b) && (result6 = a > b - 8);

        System.out.println("&& result4: " + result4);
        System.out.println("&& result5: " + result5);
        System.out.println("&& result6: " + result6);
        System.out.println("&& overallResult2: " + overallResult2);
    }
}
