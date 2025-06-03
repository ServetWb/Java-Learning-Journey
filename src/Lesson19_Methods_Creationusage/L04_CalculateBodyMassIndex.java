package Lesson19_Methods_Creationusage;

import java.util.Scanner;

public class L04_CalculateBodyMassIndex {

    public static void main(String[] args) {

        System.out.println(calculateBMI());
    }

    // Question 2 - Create a method that:
    //              - Asks the user for their weight (kg) and height (cm)
    //              - Calculates and returns the Body Mass Index (BMI)
    // Formula:     BMI = weight * 10000 / (height * height)

    public static double calculateBMI() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your weight in kilograms:");
        double weight = scanner.nextDouble();

        System.out.println("Please enter your height in centimeters:");
        double height = scanner.nextDouble();

        return weight * 10000 / (height * height);
    }
}
