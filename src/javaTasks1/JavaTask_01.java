package javaTasks1;

import java.util.Scanner;

public class JavaTask_01 {

    public static void main(String[] args) {

        /*
        Write a method that can print the maximum number between two numbers, if both are equal then print Equal
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int num1 = scan.nextInt();

        System.out.println("Enter number 2:");
        int num2 = scan.nextInt();

        int max = 0;

        if (num1>num2) {
            max = num1;
            System.out.println("max = " + max);
        } else if (num2>num1) {
            max = num2;
            System.out.println("max = " + max);
        }else {
            System.out.println("equal");
        }

        scan.close();
    }
}
