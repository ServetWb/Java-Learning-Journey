package Lesson11_switchStatement_stringManipulations;

public class L07_SM_charAt {
    public static void main(String[] args) {

         /*
            charAt(index)
            In Java, indexing starts at 0
            For the 1st character → index == 0
            For the 4th character → index == 3

            The last character's index is (number of characters - 1)

            If you try to use charAt(length) or a higher index,
            Java throws a StringIndexOutOfBoundsException
         */

        String text = "Java is beautiful";

        // Print the first character
        System.out.println(text.charAt(0)); // J

        // Print the 4th character
        System.out.println(text.charAt(3)); // a

        // Print the last character
        // The string has 16 characters
        System.out.println(text.charAt(16 - 1)); // l

        // If we know the character count is 16,
        // print the 3rd character from the end
        System.out.println(text.charAt(13)); // f   (16 - 3 = 13)

        // Java is beautiful

        // If we know the character count is 16,
        // try to print the character at index 16

        // System.out.println(text.charAt(43)); // StringIndexOutOfBoundsException
        // String index out of range: 16
    }
}
