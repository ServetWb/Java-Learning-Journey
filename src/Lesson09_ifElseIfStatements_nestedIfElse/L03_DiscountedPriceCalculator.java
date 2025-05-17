package Lesson09_ifElseIfStatements_nestedIfElse;

import java.util.Scanner;

public class L03_DiscountedPriceCalculator {

    public static void main(String[] args) {

        // Ask the user how many items they bought and the price per item.
        // If the user bought 100 or more items, apply a 25% discount.
        // If the user bought 50 or more items, apply a 20% discount.
        // If the user bought 10 or more items, apply a 10% discount.
        // Otherwise, there is no discount.
        // If the user enters a negative quantity or price, display a warning.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the quantity of items you purchased:");
        int quantity = scanner.nextInt();

        System.out.println("Please enter the unit price of the item:");
        double unitPrice = scanner.nextDouble();

        // Calculate total price before discount
        double totalPriceWithoutDiscount = quantity * unitPrice;

        // Check for invalid inputs
        if (quantity < 0 || unitPrice < 0) {
            System.out.println("The quantity or unit price you entered is invalid.");
        }
        // Apply discount based on quantity
        else if (quantity >= 100) {
            System.out.println("25% discounted total price: " + totalPriceWithoutDiscount * 75 / 100);
        } else if (quantity >= 50) {
            System.out.println("20% discounted total price: " + totalPriceWithoutDiscount * 80 / 100);
        } else if (quantity >= 10) {
            System.out.println("10% discounted total price: " + totalPriceWithoutDiscount * 90 / 100);
        } else {
            System.out.println("No discount applied. Total price: " + totalPriceWithoutDiscount);

        }
    }
}