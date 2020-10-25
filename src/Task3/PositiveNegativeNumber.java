package Task3;
import java.util.Random;
public class PositiveNegativeNumber {
    /**
     * Task:
     * Generate a random integer number, output it, then specify whether it negative or positive.
     * You MUST use "ternary" operator.
     */
        public static void main(String[] args) {
            Random random = new Random(System.currentTimeMillis());
            int randomNumber = random.nextInt(Integer.MAX_VALUE) * (random.nextBoolean() ? -1 : 1);
            String result = (randomNumber < 0) ? "negative" : "positive";
            System.out.println("result");

            }
            //   int x = 6;
            //        int n1 = 5 < x-- ? 5 : 7;
            //        switch ( n1) {
            //            default:
            //                System.out.println("NAN");
            //            case 1:
            //                System.out.println("1");
            //            case 3:
            //                System.out.println("3");
            //                case 7:
            //                System.out.println("2");
            //                break;
        }

