package Lesson02_Variables_DataTypes;

public class L05_NamingConvention {

    public static void main(String[] args) {

        int score = 70;
        int scorE = 90;
        int scoRE = 50;
        int Score = 67;
        int SCORE = 43;

        System.out.println(score); // 70
// System.out.println(NoT); // This will cause an error because such a variable is not defined


// 2- Variable names usually start with a lowercase letter
//    Java will not throw an error if this rule is not followed,
//    but it goes against common naming conventions


// 3- Variable names can include letters, numbers, $ or _
//    BUT cannot contain spaces or special characters

// int student age = 12;     // Space causes an error
// int student%age = 12;     // Special character causes an error
        int student1Age = 12;
        int student_age = 12;
        int student$age = 12;


// 4- Variable names can start with $ or _
//    but it is NOT recommended

        String _school = "Midland College";
        String $school = "Midland College";


// 5- You can use numbers in variable names,
//    but the name CANNOT start with a number

        String school1Name = "Permian";
// String 1schoolName = "Permian"; // Invalid


// 6- If the variable name has more than one word,
//    use camelCase naming convention

        double studentAgeAverage = 12.5;

        System.out.println(school1Name.toUpperCase());


// 7- Reserved keywords cannot be used as variable names
// int int = 8;
// String class = "Joe";
// boolean for = true;
    }
}
