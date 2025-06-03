package Lesson19_Methods_Creationusage;

public class L01_IsPasswordValid {


    // Question 4: For a given password,
    //             create a method that checks the following conditions
    //             and returns true if the password is valid,
    //             false if the password is not valid.
    //             - The first character must be a lowercase letter
    //             - The last character must be a digit
    //             - The password must not contain any spaces
    //             - The length must be at least 10 characters

    public static void main(String[] args) {

        isPasswordValid("whocares");
        // Line 16: Calls the isPasswordValid() method
        // The method runs and checks whether the password "whocares" is valid
        // and returns true or false
        // But since we didn’t print the result using sout,
        // we won’t see the result in the console,
        // and since we didn’t assign it to a variable, we can’t reuse it later in the code

        System.out.println(isPasswordValid("whatsup?")); // false
        // Line 24: Calls the isPasswordValid() method
        // The method runs and checks whether the password "whatsup?" is valid
        // and returns true or false
        // Since the method is called inside a println, we’ll see the result in the console
        // But still, we didn’t assign it to a variable, so we can’t reuse it

        boolean result = isPasswordValid("paradiseGarden11");
        // Line 32: Calls the isPasswordValid() method
        // The method runs and checks whether the password "paradiseGarden11" is valid
        // and returns true or false
        // We didn’t use println, so we won’t see it in the console
        // But since we assigned it to a variable, we can use it later — either print it or use it in logic

        System.out.println("Result of checking paradiseGarden11: " + result);
    }

    public static boolean isPasswordValid(String password) {
        int flag = 10;

        // - The first character must be a lowercase letter
        char firstChar = password.charAt(0);

        if (!Character.isLowerCase(firstChar)) {
            flag = 11;
        }

        // - The last character must be a digit
        char lastChar = password.charAt(password.length() - 1);

        if (lastChar < '0' || lastChar > '9') {
            flag = 11;
        }

        // - The password must not contain any spaces
        if (password.contains(" ")) {
            flag = 11;
        }

        // - The length must be at least 10 characters
        if (!(password.length() >= 10)) {
            flag = 11;
        }

        /*
            By the end, the flag can be either 10 or 11
            flag == 10 → means no validation errors occurred
            flag == 11 → means at least one validation rule failed, but we don’t know which or how many
         */

        // If the return type is not void,
        // the method must return a value matching the declared return type
        if (flag == 10) {
            return true;
        } else {
            return false;
        }
    }
}
