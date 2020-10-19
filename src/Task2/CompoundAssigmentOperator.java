package Task2;

/*
 * Task:
 * Change the following program to use compound assignments.
 * The compound assignments look like: =+, =-, =% and so on.
 */
public class CompoundAssigmentOperator {

    public static void main(String[] args) {
        int totalResult = 20;

        totalResult = totalResult + 30;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult - 43;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult * 4;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult / 8;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult % 7;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult += 40;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult *= 50;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult -= 40;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult <<= 10;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult >>= 200;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult &= 5;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult ^= 5;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult |= 7;
        System.out.println("Total result: " + totalResult);








        }
    }



