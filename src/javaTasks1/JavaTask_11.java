package javaTasks1;

import java.util.Scanner;

public class JavaTask_11 {

    public static void main(String[] args) {

        /*
        Create a class called Reverse, write a program that will reverse a string.
    Your program should reverse a string only 5 characters long.
       If word is shorter, display message: "Too short!".
       If word is longer, display message: "Too long!".
   Otherwise, reverse this word and print out result into the console.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();

        String reverse = "";


       /*   reverse += word.charAt(word.length()-1);
            reverse += word.charAt(word.length()-2);
            reverse += word.charAt(word.length()-3);
            reverse += word.charAt(word.length()-4);
            .......................................     */


        for (int i = word.length()-1; i >=0 ; i--) {

            reverse += word.charAt(i);
        }

        System.out.println("reverse = " + reverse);

        scan.close();

    }
}
