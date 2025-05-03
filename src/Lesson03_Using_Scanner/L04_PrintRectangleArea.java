package Lesson03_Using_Scanner;

import java.util.Scanner;

public class L04_PrintRectangleArea {

    public static void main(String[] args) {


        // Get the lengths of two sides of a rectangle from the user,
// then print the area of the rectangle.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the side lengths of the rectangle...");
        double longSide = scanner.nextDouble();
        double shortSide = scanner.nextDouble();

        System.out.println("The area of the rectangle = " + (shortSide * longSide));
    }
}
