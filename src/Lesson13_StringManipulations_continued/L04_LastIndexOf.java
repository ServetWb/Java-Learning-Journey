package Lesson13_StringManipulations_continued;

public class L04_LastIndexOf {

    public static void main(String[] args) {

        String str = "Hello there, everyone";

        System.out.println(str.indexOf("e")); // 1

        // Print the index of the 2nd occurrence of 'e'
        System.out.println(str.indexOf('e', 2)); // 7

        // Print the index of the last occurrence of 'a' in the sentence
        // If you want the last occurrence index of a char or substring,
        // use lastIndexOf() instead of indexOf()
        System.out.println(str.lastIndexOf('e'));  // 16


        str = "Write code with Java, writing code is very beautiful";

        System.out.println(str.indexOf("Java"));       // 16
        System.out.println(str.lastIndexOf("Java"));   // 16

        System.out.println(str.indexOf("code"));       // 6
        System.out.println(str.lastIndexOf("code"));   // 25

        System.out.println(str.indexOf("a"));          // 19
        System.out.println(str.lastIndexOf("a"));      // 44

        System.out.println(str.indexOf("write"));      // -1 (case-sensitive, "write" != "Write")
        System.out.println(str.lastIndexOf("write"));  // -1

        System.out.println(str.indexOf("Write"));      // 0
        System.out.println(str.lastIndexOf("Write"));  // 18  // Actually, no "Write" at 18, so lastIndexOf("Write") == 0

        System.out.println(str.indexOf("x"));          // -1  (not found)
        System.out.println(str.lastIndexOf("x"));      // -1  (not found)


        // lastIndexOf(char ch, int fromIndex) starts searching backward from given index
        System.out.println(str.lastIndexOf('a', 20));  // 19

        System.out.println(str.lastIndexOf('a', 18));  // 3
    }
}
