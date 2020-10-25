package Task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CollectUserInfo {
    /*
     * Task:
     * Collect user info like their names, age, marriage status, insurance ID, total income in a year, etc.
     * You can use as an example from the ScannerUsageExample class.
     * You must use the most appropriate type for each variable and not just Strings for everything.
     * Do be shy to check other info out in the internet.
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you married? (true, false): ");
        boolean isMarried = scanner.nextBoolean();
        System.out.println("Marriage: " + isMarried);

        System.out.println("Input u age:  ");
        byte age = scanner.nextByte();
        System.out.println(" age:" + age);

        System.out.println("What is your body height in centimeters (30 - 250): \");\n");
        short bodyHeightInCentimeters = scanner.nextShort();
        System.out.println("bodyHeightInCentimeters: " + bodyHeightInCentimeters);

        System.out.println("What is your insurance ID? (0 - " + Integer.MAX_VALUE + "): ");
        int insuranceId = scanner.nextInt();
        System.out.println("insuranceId: " + insuranceId );

        System.out.println("What is your body weight in kilograms? (4.0 - 200.0): ");
        float bodyWeightInKilograms = scanner.nextFloat();
        System.out.println("bodyWeightInKilograms:" + bodyWeightInKilograms);

        System.out.println("What is your year salary? (0.0 - 9000000.00)");
        double salary = scanner.nextDouble();
        System.out.println("salary: " + salary);

        System.out.println("LatterOfName:  ");
        char firstLetterOfName = scanner.next().charAt(0);
        System.out.println("firstLetterOfName:" + firstLetterOfName);

        System.out.println("Input you Name : ");
        String firstName = scanner.next();
        System.out.println("firsName:" + firstName);
    }
}

   /* } catch (InputMismatchException ex) {
        System.out.println("You have entered an incorrect value! Try to use one that limited in each output message.");
    }
}

           /* try {
                System.out.println("Hi, how are you? I have some questions about you.");
                System.out.println("Are you married? (true, false): ");
                isMarried = scanner.nextBoolean();

                System.out.println("What is your age? (0 - 127): ");
                age = scanner.nextByte();

                System.out.println("What is your body height in centimeters (30 - 250): ");
                bodyHeightInCentimeters = scanner.nextShort();

                System.out.println("What is your insurance ID? (0 - " + Integer.MAX_VALUE + "): ");
                insuranceId = scanner.nextInt();

                System.out.println("What is your tax ID? (0 - " + Long.MAX_VALUE + "): ");
                taxId = scanner.nextLong();

                System.out.println("What is your body weight in kilograms? (4.0 - 200.0): ");
                bodyWeightInKilograms = scanner.nextFloat();

                System.out.println("What is your year income? (0.0 - 9000000.00)");
                yearIncomeInDollars = scanner.nextDouble();

                System.out.print("What is the first letter of your first name? Type only one letter: ");
                firstLetterOfName = scanner.next().charAt(0);

                System.out.print("What is your first name? Type a string: ");
                firstName = scanner.next();

                System.out.println("\n---------------------");
                System.out.println("Your info:");

                System.out.println("Marriage: " + isMarried);
                System.out.println("Age: " + age);
                System.out.println("Body height: " + bodyHeightInCentimeters);
                System.out.println("Insurance ID: " + insuranceId);
                System.out.println("Tax ID: " + taxId);
                System.out.println("Body weight: " + bodyWeightInKilograms);
                System.out.println("Year income: " + yearIncomeInDollars + "$");
                System.out.println("The first letter of the name: " + firstLetterOfName);
                System.out.println("The first name: " + firstName);
            } catch (InputMismatchException ex) {
                System.out.println("You have entered an incorrect value! Try to use one that limited in each output message.");
            }
        }
}

*/

