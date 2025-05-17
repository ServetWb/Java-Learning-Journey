package Lesson09_ifElseIfStatements_nestedIfElse;

import java.util.Scanner;

public class L06_MultipleVariables_2 {
    // Ask the user for the number of products they are buying and the unit price without any discount.
    // Ask if the user has a customer card.
    // If the user has a customer card:
    //    - If they buy more than 10 items, apply a 20% discount.
    //    - If they buy 10 or fewer items, apply a 15% discount.
    // If the user does not have a customer card:
    //    - If they buy more than 10 items, apply a 15% discount.
    //    - If they buy 10 or fewer items, apply a 10% discount.

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of products you purchased...");
        int quantity = scanner.nextInt();

        System.out.println("Please enter the unit price of the product...");
        double unitPrice = scanner.nextDouble();

        System.out.println("Do you have a customer card? E: Yes, H: No");
        char hasCard = scanner.next().toUpperCase().charAt(0);

        // Calculate the total price without any discount
        double totalPriceWithoutDiscount = quantity * unitPrice;

        // Apply the discount based on the user's card and quantity of products
        if (hasCard == 'E' && quantity > 10) {
            System.out.println("Total price with 20% discount: " + totalPriceWithoutDiscount * 80 / 100);
        } else if (hasCard == 'E') {  // Condition 'quantity <= 10' is always 'true' when reached
            System.out.println("Total price with 15% discount: " + totalPriceWithoutDiscount * 85 / 100);
        } else if (hasCard == 'H' && quantity > 10) {
            System.out.println("Total price with 15% discount: " + totalPriceWithoutDiscount * 85 / 100);
        } else if (hasCard == 'H') {  // && quantity <= 10
            System.out.println("Total price with 10% discount: " + totalPriceWithoutDiscount * 90 / 100);
        } else {
            System.out.println("The entered values cannot be processed for price calculation.");

        }
    }
}