package Lesson25_Arrays;

public class L07_Assignment {

    // Create a String array by taking input from the user
    // Then print the longest and shortest words in the array

    public static void main(String[] args) {

        String[] words = L05_CreateArrayFromUserInput.createArrayFromUser();

        String shortestWord = words[0];
        String longestWord = words[0];

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() < shortestWord.length()) {
                // The word from the loop is shorter than the current shortest
                shortestWord = words[i];
            }

            if (words[i].length() > longestWord.length()) {
                // The word from the loop is longer than the current longest
                longestWord = words[i];
            }
        }

        System.out.println("The longest word entered: " + longestWord);
        System.out.println("The shortest word entered: " + shortestWord);
    }

}
