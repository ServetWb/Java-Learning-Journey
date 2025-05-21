package Lesson12_StringManipulations;

public class L04_Contains {
    public static void main(String[] args) {

        String str = "Java learning will never make you regret.";

        // Check if the string contains the letter "a"
        System.out.println(str.contains("a")); // true

        // Check if the string contains the substring "r m"
        System.out.println(str.contains("r m")); // true

        // Check if the string contains the substring "J    l"
        System.out.println(str.contains("J    l")); // false

        // Check if the string contains the substring "Java le"
        System.out.println(str.contains("Java le")); // true
    }
}
