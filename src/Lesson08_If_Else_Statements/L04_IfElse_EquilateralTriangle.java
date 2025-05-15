package Lesson08_If_Else_Statements;

import java.util.Scanner;

public class L04_IfElse_EquilateralTriangle {
    public static void main(String[] args) {
        // Ask the user to enter the lengths of the 3 sides of a triangle,
        // If the triangle is equilateral, print "Equilateral triangle"
        // Otherwise, print "Not an equilateral triangle"
        // Note: Side lengths must be positive

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lengths of the triangle's sides...");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        if (side1 == side2 && side2 == side3 && side3 > 0) {
            System.out.println("Equilateral triangle");
        } else {
            System.out.println("Not an equilateral triangle");
        }
    }
}