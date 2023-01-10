package javaTasks1;

import java.util.Scanner;

public class JavaTask_16 {

    public static void main(String[] args) {

        /*
        Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
        HINT: you can substract the number and keep track of how many times you substracted with while loop.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first positive number:");
        int num1 = scan.nextInt();

        System.out.println("Enter second positive number: (must be smaller than first one)");
        int num2 = scan.nextInt();

        int count = 0;
        int remainder = 0;


        while (num1 >= num2){
            remainder = num1-num2;
            count++;

            num1 = remainder;
        }

        System.out.println("First number / Second number => quotient= " + count + " remainder = " + remainder );

        scan.close();
    }
}
