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

            // your code here
        }
    }

