package Lesson14_Lesson13_StringManipulations_continued2;

public class L04_SummingStringPricesExample {
    public static void main(String[] args) {

        // Add and print prices given by the user as Strings in a specific format.
        //    input1: "15.30 €", input2: "11.45 €"
        //    output: 26.75 €
        // NOTE: The currency symbol at the end should be dynamic.

        String priceStr1 = "15.30 €";
        String priceStr2 = "11.45 €";

        // Concatenating the two strings (not addition)
        System.out.println(priceStr1 + priceStr2); // Output: 15.30 €11.45 €

        // First, extract and save the currency symbol (including the space before it)
        int lastSpaceIndex = priceStr1.lastIndexOf(" ");
        String currency = priceStr1.substring(lastSpaceIndex);  // " €"

        // Remove all non-digit characters (including dot and currency) from the strings
        priceStr1 = priceStr1.replaceAll("\\D", "");  // "1530"
        priceStr2 = priceStr2.replaceAll("\\D", "");  // "1145"

        // Convert the cleaned strings to double by dividing by 100 to restore decimal places
        double priceD1 = Double.parseDouble(priceStr1) / 100; // 15.30
        double priceD2 = Double.parseDouble(priceStr2) / 100; // 11.45

        // Add the double prices and append the saved currency symbol
        System.out.println(priceD1 + priceD2 + currency);  // Output: 2
    }
}