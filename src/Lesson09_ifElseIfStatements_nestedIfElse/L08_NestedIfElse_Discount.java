package Lesson09_ifElseIfStatements_nestedIfElse;

import java.util.Scanner;

public class L08_NestedIfElse_Discount {
    public static void main(String[] args) {

        // Ask the user for the number of products and the unit price without discount,
        // Ask if the user has a customer card.
        // If the user has a customer card and buys more than 10 products, apply a 20% discount,
        // If they buy 10 or fewer products, apply a 15% discount.
        // If the user doesn't have a customer card and buys more than 10 products, apply a 15% discount,
        // If they buy 10 or fewer products, apply a 10% discount.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of products you purchased...");
        int quantity = scanner.nextInt();

        System.out.println("Please enter the unit price of the product without discount...");
        double unitPrice = scanner.nextDouble();

        System.out.println("Do you have a customer card? Y : Yes, N : No");
        char hasCard = scanner.next().toUpperCase().charAt(0);

        double totalPriceWithoutDiscount = quantity * unitPrice;

        // The main variable will be whether the user has a card or not

        if (hasCard == 'Y') {
            // Section for users with a customer card
            if (quantity > 10) {
                System.out.println("Total price with 20% discount: " + totalPriceWithoutDiscount * 80 / 100);
            } else if (quantity > 0) {
                System.out.println("Total price with 15% discount: " + totalPriceWithoutDiscount * 85 / 100);
            } else { // For cases where the quantity entered is 0 or negative
                System.out.println("You must enter a positive number for the product quantity...");
            }

        } else if (hasCard == 'N') {
            // Section for users without a customer card
            if (quantity > 10) {
                System.out.println("Total price with 15% discount: " + totalPriceWithoutDiscount * 85 / 100);
            } else if (quantity > 0) {
                System.out.println("Total price with 10% discount: " + totalPriceWithoutDiscount * 90 / 100);
            } else { // For cases where the quantity entered is 0 or negative
                System.out.println("You must enter a positive number for the product quantity...");
            }
        }
    }
}