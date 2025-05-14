package Lesson07_Operators_IfElse_Statements;

import java.util.Scanner;

public class L06_EquilateralTriangleCheck {

    public static void main(String[] args) {

        // Get the side lengths of a triangle from the user
        // If all side lengths are equal, print "Equilateral triangle"
        // NOTE: Side lengths must be positive

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the side lengths of the triangle...");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        if (side1 == side2 && side1 == side3 && side1 > 0) {
            System.out.println("Equilateral triangle");
        }
    }
}