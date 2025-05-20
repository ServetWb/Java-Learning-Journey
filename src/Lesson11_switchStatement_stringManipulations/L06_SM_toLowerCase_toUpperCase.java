package Lesson11_switchStatement_stringManipulations;

import java.util.Locale;

public class L06_SM_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String text = "Java is Awesome";

        System.out.println(text.toUpperCase()); // JAVA IS AWESOME
        System.out.println(text.toLowerCase()); // java is awesome

        // In Java, unless we assign the result to a variable,
        // changes made by string methods are NOT permanent

        System.out.println(text); // Java is Awesome

        // To make the change permanent, we need to assign the result

        // Convert 'text' to all uppercase letters and update it
        text = text.toUpperCase();

        System.out.println("After permanent change, text: " + text);
        // After permanent change, text: JAVA IS AWESOME

        text = "All vineyards and gardens belong to the vintner.";

        System.out.println(text.toUpperCase());
        // ALL VINEYARDS AND GARDENS BELONG TO THE VINTNER.

        text = text.toUpperCase();
        // ALL VINEYARDS AND GARDENS BELONG TO THE VINTNER.

        // Let's print 'text' in lowercase
        System.out.println(text.toLowerCase());
        // all vineyards and gardens belong to the vintner.

        /*
            When converting between uppercase and lowercase characters
            in languages other than English,
            Java applies locale-specific rules automatically.

            HOWEVER...

            In English, the lowercase of 'I' is 'i'.
            So when 'I' is converted to lowercase, Java uses the English rule
            and returns 'i'.

            IF you want 'I' to be converted into the Turkish lowercase 'ı',
            you must explicitly set the locale to Turkish in Java.
         */

        System.out.println(text.toLowerCase(Locale.forLanguageTag("tr")));
        // all vineyards and gardens belong to the vintner. (with correct Turkish character handling)
    }
}
