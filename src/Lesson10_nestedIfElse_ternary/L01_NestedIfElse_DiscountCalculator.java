package Lesson10_nestedIfElse_ternary;

import java.util.Scanner;

public class L01_NestedIfElse_DiscountCalculator {

    public static void main(String[] args) {

        // Ask the user for the quantity of the product they bought and the unit price without discount
        // Ask the user whether they have a customer card
        // If the user has a card:
        //      If they buy more than 10 products: apply 20% discount
        //      If they buy 10 or fewer: apply 15% discount
        // If the user does not have a card:
        //      If they buy more than 10 products: apply 15% discount
        //      If they buy 10 or fewer: apply 10% discount

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the quantity of the product you bought...");
        int quantity = scanner.nextInt();

        System.out.println("Please enter the unit price of the product...");
        double unitPrice = scanner.nextDouble();

        System.out.println("Do you have a customer card? Y : Yes, N : No");
        char hasCard = scanner.next().toUpperCase().charAt(0);

        double totalPriceWithoutDiscount = quantity * unitPrice;

        // main variable is product quantity

        if (quantity > 10) {
            // Section for those who buy more than 10 products
            if (hasCard == 'Y')
                System.out.println("Total price with 20% discount: " + totalPriceWithoutDiscount * 80 / 100);
            else if (hasCard == 'N')
                System.out.println("Total price with 15% discount: " + totalPriceWithoutDiscount * 85 / 100);
            else
                System.out.println("Invalid response to customer card question");

        } else if (quantity > 0) {
            // Section for those who buy between 1 and 10 products
            if (hasCard == 'Y')
                System.out.println("Total price with 15% discount: " + totalPriceWithoutDiscount * 85 / 100);
            else if (hasCard == 'N')
                System.out.println("Total price with 10% discount: " + totalPriceWithoutDiscount * 90 / 100);
            else
                System.out.println("Invalid response to customer card question");

        } else {
            // Section for users who enter zero or negative product quantity
            System.out.println("Invalid product quantity entered.");
        }
    }
}
