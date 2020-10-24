package Task3;

import java.util.Scanner;

public class TypesOfWeekDays {

    /**
     * Task:
     * Create a program that output the type of a week day according to its number.
     * The number of the week day the user should be able to specify in the input.
     * Use Scanner class to read input stream from the keyboard.
     * Your solution MUST include the usage of the "switch" operator.
5     * Try to use "case" branches in the most effective way.
     * Assume for this task that there are only 2 type: working and weekend days.
     */
        public static void main(String[] args) {
            //String DayOfWeek;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write the da of the week :" );
                String DayOfWeek = scanner.nextLine();

            switch (DayOfWeek) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thuesday":
                case "Friday":
                    System.out.println("Working day");
                    break;


                    /*System.out.println("Sunday");
                    break;
                default:
                    System.out.println("The End");*/
            }

        }
    }

