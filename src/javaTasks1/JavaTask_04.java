package javaTasks1;

import java.util.Scanner;

public class JavaTask_04 {

    public static void main(String[] args) {

        /*
        Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is the biggest number output: "n1 is bigger"
            if n2 is the biggest number: "n2 is bigger"
            if n3 is the biggest number: "n3 is bigger"

         NOTE: MUST USE TERNARY
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter num1:");
        int num1= scan.nextInt();
        System.out.println("Enter num2:");
        int num2= scan.nextInt();
        System.out.println("Enter num3:");
        int num3= scan.nextInt();

        int bigger = (num1>num2 && num1>num3)? num1 :(num2>num1 && num2>num3)? num2 :num3;

        System.out.println("bigger = " + bigger);

        scan.close();


    }
}
