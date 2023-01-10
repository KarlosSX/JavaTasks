package javaTasks1;

import java.util.Scanner;

public class JavaTask_17 {

    public static void main(String[] args) {

        /*
        Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
         */

        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int number = 0;

        while (number >= 0) {

            System.out.println("Enter a positive number:");
            number = scan.nextInt();

            if (number < 0) {
                System.err.println("Invalid entry!");
                break;
            }

            sum += number;

            System.out.println("sum = " + sum);

        }
        scan.close();
    }
}
