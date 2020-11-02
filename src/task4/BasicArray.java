package io.github.valentyn.nahai.basics.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Task:
 * Create a program that will print a table 100 x 100 size of random numbers.
 * Use a two dimensions array to store numbers and the "for loop" to output them.
 * 
 * Создайте программу, которая будет печатать таблицу 100 x 100 размера произвольный чисел.
 * Используйте 2-х мерный массив чтобы хранить числа и "for loop" для их вывода.
 */
public class BasicArray {
    public static void main(String[] args) {
       Random r = new Random();
       // int anInt = r.nextInt(100);
        int[][] array = new int[100][100];

           //  for (int[] i : array) {
            //for (int j : i) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                array[i][j] =(int)( r.nextInt(15));
                System.out.print(" " + array[i][j] + " ");
        }
            System.out.println();
//
        }
    }
}

