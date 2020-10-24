package Task3;
/*
 * Into:
 * Body mass index (BMI) is a value derived from the mass (weight) and height of a person.
 * The BMI is defined as the body mass divided by the square of the body height,
 * and is universally expressed in units of kg/m2,
 * resulting from mass in kilograms and height in metres.
 *
 * Task:
 * Create a basic BMI calculator.
 * The sample output:
 * Your height in m: 1.85
 * Your weight in kg: 77
 * ---------------------
 * Your BMI is 22.5
 */

public class BMICalculator {
    public static void main(String[] args) {
        double height = 1.85;
        double weight = 77;
        double BMI;
        BMI = weight / (height * height);
        System.out.println("Your height in m: " + weight );
        System.out.println("Your weight in kg: " + height);
        System.out.println("Your BMI :" + BMI);

        // your code here
    }
}
