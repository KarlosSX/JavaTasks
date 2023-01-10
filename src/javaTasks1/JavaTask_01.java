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


        System.out.println("maxnum(num1,num2) = " + maxnum(num1, num2));


        scan.close();
    }

    public static int maxnum (int num1, int num2){

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

        return max;
    }
}
