package task5;
/**
 * Task:
 * Create overloaded methods for summarizing and printing 2 numbers of different types as many as you want.
 * These methods can be static and declared in the class with the "main" method.
 *
 * Задание:
 * Создайте перегруженные методы для суммирования и печати 2 чисел разных типов.
 * Эти методы могут быть статическими и объявляться в классе с "main" методом.
 */
public class OverloadingMethod {
        public static void main(String[] args) {
            Overload over = new Overload();
            over.overLoad();
            System.out.println();
            sumAndPrint(4, 5);
            sumAndPrint(6.7, 4.5);
            sumAndPrint(8, 9, 2.5);
            sumAndPrint(23.5f, 91.7f, 2.5f);
            sumAndPrint(23.5, 894.3);
            sumAndPrint(50046895, 78965324);

        }
        static class Overload{
            void overLoad(){
                System.out.println(" Without numbers");
            }
        }
        public static int sumAndPrint(int firstNumber, int secondNumber) {
            System.out.println("The sum of 2 integer values is " + (firstNumber + secondNumber));
            return firstNumber + secondNumber;
        }

        public static double sumAndPrint(double firstNumber, double secondNumber) {
            System.out.println("The sum of 2 double values is " + (firstNumber + secondNumber));
            return firstNumber + secondNumber;
        }
        public static double sumAndPrint( double firstNumber, double secondNumber, double thirdNumber) {
            System.out.println("The sum of 3 douuble name is " + (firstNumber + secondNumber + thirdNumber));
            return firstNumber + secondNumber + thirdNumber;
        }
        public static float sumAndPrint( float firstNumber, float secondNumber, float thirdNumber) {
            System.out.println("The sum of 3 float name is " + (firstNumber + secondNumber + thirdNumber));
            return firstNumber + secondNumber + thirdNumber;
        }
         public static float sumAndPrint( float firstNumber, float secondNumber) {
            System.out.println("The sum of 2 float name is " + (firstNumber + secondNumber));
            return firstNumber + secondNumber;
        }
         public static long sumAndPrint( long firstNumber, long secondNumber) {
            System.out.println("The sum of 2 long name is " + (firstNumber + secondNumber));
            return firstNumber + secondNumber;
        }


    }

