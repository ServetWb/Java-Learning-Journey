package Lesson19_Methods_Creationusage;

public class L05_UseBMI {

    public static void main(String[] args) {

        // Question 2 - Ask the user for their weight (kg) and height (cm),
        //              then calculate the Body Mass Index (BMI)
        // Formula:     BMI = weight * 10000 / (height * height)
        //
        // BMI Categories:
        //   - Above 30 → Obese
        //   - Between 25 and 30 → Overweight
        //   - Between 20 and 25 → Normal
        //   - Below 20 → Underweight

        double bmi = L04_CalculateBodyMassIndex.calculateBMI();

        System.out.println("Your Body Mass Index (BMI): " + bmi);

        if (bmi > 30)
            System.out.println("Obese");
        else if (bmi > 25)
            System.out.println("Overweight");
        else if (bmi > 20)
            System.out.println("Normal");
        else
            System.out.println("Underweight");
    }
}
