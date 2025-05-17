package Lesson09_ifElseIfStatements_nestedIfElse;

import java.util.Scanner;

public class L02_BodyMassIndex {


    public static void main(String[] args) {

        // Question 2 - Ask the user for their weight (in kg) and height (in cm),
        //              then calculate the Body Mass Index (BMI) using the formula:
        //              BMI = weight * 10000 / (height * height)
        //
        //              If BMI > 30        → print "Obese"
        //              If BMI between 25 and 30 (inclusive) → print "Overweight"
        //              If BMI between 20 and 25 (inclusive) → print "Normal"
        //              If BMI < 20        → print "Underweight"

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your weight in kilograms (kg):");
        double weight = scanner.nextDouble();

        System.out.println("Please enter your height in centimeters (cm):");
        double height = scanner.nextDouble();

        double bmi = weight * 10000 / (height * height);

        System.out.println("Your Body Mass Index (BMI) is: " + bmi);

        if (bmi > 30) {
            System.out.println("Obese");
        } else if (bmi > 25) {
            System.out.println("Overweight");
        } else if (bmi > 20) {
            System.out.println("Normal");
        } else {
            System.out.println("Underweight");

        }
    }
}
