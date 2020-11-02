package io.github.valentyn.nahai.basics.loops;

import java.util.Random;
import java.util.Scanner;

/*
 * Task:
 * Create a program that will set a random secret number, ask the user to input a guess number,
 * and keep printing the prompt message until the number is revealed.
 * Use do-while loop.
 * 
 * Создайте программу, которая будет задавать произвольное секретое число, спрашивать пользователя ввести
 * число для одгадывания, продолжать печатать приглашения для ввода, пока число не будет раскрыто.
 * Используйте do-while цикл.
 */
public class GuessingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 10 ;
        int guess ;
         Random r = new Random(10);
        do {
            System.out.println("Input secret number: " + " ");
            guess = scanner.nextInt();
            if (guess == value) {
                System.out.println("U guessed ");
            } else if (guess >= value) {
                    System.out.println(" Wrong , try againe");
            } else {
                System.out.println(" You are wrong");
            }
        }
         while (guess != value);
        
        
    }
}
