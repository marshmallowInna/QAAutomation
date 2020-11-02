package task3;

import java.util.Scanner;

/** Task:
        * Create a program that will ask the user about a solar system planet they want to visit.
        * And calculate the weight according to the user choose that they would have there.
        * The weight might be calculated using the following formula: weight = mass * surface gravity.
        * The "mass", "planet" should be asked from the user using Scanner class.
        * You MUST use only the different flavors of the "if" operator in this task.*/
public class WeightOnSolarSystemPlanets {

    public static void main(String[] args) {
        final double SURFACE_GRAVITY_ON_MERCURY = 0.155;
        final double SURFACE_GRAVITY_ON_VENUS = 0.8975;
        final double SURFACE_GRAVITY_ON_EARTH = 1.000;
        final double SURFACE_GRAVITY_ON_MOON = 0.1660;
        final double SURFACE_GRAVITY_ON_MARS = 0.3507;
        final double SURFACE_GRAVITY_ON_JUPITER = 2.5374;
        final double SURFACE_GRAVITY_ON_SATURN = 1.0677;
        final double SURFACE_GRAVITY_ON_URANUS = 0.8947;
        final double SURFACE_GRAVITY_ON_NEPTUNE = 1.1794;
        final double SURFACE_GRAVITY_ON_PLUTO = 0.0899;
        System.out.println("Input planet: ");
        Scanner scanner = new Scanner(System.in);
        String planet = scanner.nextLine();
        System.out.println("Input mass: ");
        double mass = scanner.nextDouble();
        if (planet.equals("MERCURY")) {
            double weight = mass * SURFACE_GRAVITY_ON_MERCURY;
            System.out.println(" MERCURY : " + weight);
        } else if (planet.equals("VENUS")) {
            double weight = mass * SURFACE_GRAVITY_ON_VENUS;
            System.out.println("VENUS: " + weight);
        } else if (planet.equals("EARTH")) {
            double weight = mass * SURFACE_GRAVITY_ON_EARTH;
            System.out.println("EARTH: " + weight);
        } else if (planet.equals("MOON")) {
            double weight = mass * SURFACE_GRAVITY_ON_MOON;
            System.out.println("MOON: " + weight);
        } else if (planet.equals("MARS")) {
            double weight = mass * SURFACE_GRAVITY_ON_MARS;
            System.out.println("MARS: " + weight);
        } else if (planet.equals("JUPITER")) {
            double weight = mass * SURFACE_GRAVITY_ON_JUPITER;
            System.out.println("JUPITER: " + weight);
        } else if (planet.equals("SATURN")) {
            double weight = mass * SURFACE_GRAVITY_ON_SATURN;
            System.out.println("SATURN: " + weight);
        } else if (planet.equals("URANUS")) {
            double weight = mass * SURFACE_GRAVITY_ON_URANUS;
            System.out.println("URANUS: " + weight);
        } else if (planet.equals("URANUS")) {
            double weight = mass * SURFACE_GRAVITY_ON_NEPTUNE;
            System.out.println("NEPTUNE: " + weight);
        } else if (planet.equals("PLUTO")) {
            double weight = mass * SURFACE_GRAVITY_ON_PLUTO;
            System.out.println("PLUTO: " + weight);
        } else {
            System.out.println("Invalid");
        }
    }
}
        


            // your code here

