package Lesson18_Methods_Creationusage;

public class L03_NameFormatter {

       /*
        Create a method that:
        - Checks the given first name and last name
        - If the first name is longer:
            → Print both names with the first letter uppercase, the rest lowercase
        - If the last name is longer:
            → Print the first name with the first letter uppercase, the rest lowercase
            → Print the last name in all uppercase
    */

    public static void main(String[] args) {

        formatAndPrintName("Jonathan", "Lee");
        formatAndPrintName("Eva", "Anderson");
        formatAndPrintName("Madison Grace", "Smith");
    }

    public static void formatAndPrintName(String firstName, String lastName) {

        if (firstName.length() > lastName.length()) {
            // If the first name is longer:
            // Print both names with the first letter uppercase and the rest lowercase

            System.out.println(
                    firstName.substring(0, 1).toUpperCase() +
                            firstName.substring(1).toLowerCase() + " " +
                            lastName.substring(0, 1).toUpperCase() +
                            lastName.substring(1).toLowerCase()
            );

        } else if (lastName.length() > firstName.length()) {
            // If the last name is longer:
            // Print the first name with the first letter uppercase and the rest lowercase
            // Print the last name in all uppercase

            System.out.println(
                    firstName.substring(0, 1).toUpperCase() +
                            firstName.substring(1).toLowerCase() + " " +
                            lastName.toUpperCase()
            );
        } else {
            // If both are the same length, apply default formatting
            System.out.println(
                    firstName.substring(0, 1).toUpperCase() +
                            firstName.substring(1).toLowerCase() + " " +
                            lastName.substring(0, 1).toUpperCase() +
                            lastName.substring(1).toLowerCase()
            );

        }
    }
}