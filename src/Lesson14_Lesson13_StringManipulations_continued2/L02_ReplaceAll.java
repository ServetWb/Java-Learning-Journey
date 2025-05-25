package Lesson14_Lesson13_StringManipulations_continued2;

public class L02_ReplaceAll {

    public static void main(String[] args) {

        // Example string
        String str = "Coding with Java is very nice";

        // Remove all occurrences of 'a' from the string
        System.out.println(str.replace("a", ""));
        // Output: Coding with Jv is very nice

        // Replace all occurrences of 'a' with uppercase 'A'
        System.out.println(str.replaceAll("a", "A"));
        // Output: Coding with JAvA is very nice

        /*
            If we want to replace a part of a given text with a new text,
            replace() and replaceAll() perform the same function.
        */

        // Replace all 'a' and 'e' characters with uppercase versions
        System.out.println(str.replaceAll("a", "A").replaceAll("e", "E"));
        // Output: Coding with JAvA is vEry nicE

        System.out.println(str.replace('a', 'A').replace('e', 'E'));
        // Output: Coding with JAvA is vEry nicE

        System.out.println(str.replace("a", "A").replace("e", "E"));
        // Output: Coding with JAvA is vEry nicE


        // New example string with numbers mixed in
        str = "Ja67va 89C90a54n34d76i12r";

        // Remove all digits from the string
        System.out.println(str.replaceAll("\\d", ""));
        // Output: Java Candidar
    }
}
