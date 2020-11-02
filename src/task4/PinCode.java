package io.github.valentyn.nahai.basics.loops;

import java.util.Scanner;

/*
 * Task:
 * Complete the following program to handle attempts of entering an incorrect PIN code.
 * Дополните программу, чтобы оьработать попытки ввода неправильного PIN кода.
 */
public class PinCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String pinCode = "2354";

        System.out.println("Welcome to the most trusted bank!");
        System.out.print("Enter your PIN code: ");
        String entryCode = sc.nextLine();
        do {
            if (entryCode.equals(pinCode)) {
                System.out.println("Incorrected pinCode , try againe");
                entryCode = sc.nextLine();
            } else {
                System.out.println(" Welcome pin Accepted");
            }
        }
        while (entryCode.equals(pinCode));
    }

}

       
       
    
       
       // while (entryCode.equals.pinCode()) {
           // System.out.println("Pin Accepted ");
           // System.out.print("Enter your PIN code: ");
            


        //System.out.println(" Incorrect pinCode ");
            
       
        
