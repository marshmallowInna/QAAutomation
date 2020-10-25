package Task3;

import java.util.Scanner;

public class TypesOfWeekDays {

    /**
     * Task:
     * Create a program that output the type of a week day according to its number.
     * The number of the week day the user should be able to specify in the input.
     * Use Scanner class to read input stream from the keyboard.
     * Your solution MUST include the usage of the "switch" operator.
     * 5     * Try to use "case" branches in the most effective way.
     * Assume for this task that there are only 2 type: working and weekend days.
     */
    public static void main(String[] args) {
        System.out.println("Write the da of the week :");
        Scanner scanner = new Scanner(System.in);
        //int DayNumber = scanner.nextInt();
        String DayOfWeek = scanner.nextLine();
        switch (DayOfWeek) {
            case "Monday":
                System.out.println("working day ");
                break;
            case "Tuesday":
                System.out.println("working day ");
                break;
            case "Wednsday":
                System.out.println("working day ");
                break;
            case "Thursday":
                System.out.println("working day ");
                break;
            case "Friday":
                System.out.println("working day ");
                break;
            case "Saturday":
                System.out.println("DayOff");
                break;
            case "Sunday":
                System.out.println("DayOff");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}