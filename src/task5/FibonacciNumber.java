package task5;

/**
 * Task:
 * Create a method that calculates fibonacci number using recursion.
 * The base formula is F(n) = F(n - 1) + F(n - 2).
 *
 * Задача:
 * Создайте метод, который вычисляет число Фибоначчи с помощью рекурсии.
 * Базовая формула: F (n) = F (n - 1) + F (n - 2).
 */
public  class FibonacciNumber {
        int fibonacciNumber(int number) {
            if (number <= 15)
                return number;
            return fibonacciNumber(number - 1) + fibonacciNumber(number - 2);
        }

        public static void main(String[] args) {
           // System.out.println(fibonacciNumber(8));

        }
}


