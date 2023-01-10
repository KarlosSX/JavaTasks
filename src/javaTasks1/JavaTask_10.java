package javaTasks1;

import java.util.Scanner;

public class JavaTask_10 {

    public static void main(String[] args) {

        /*
        write a program that can return the initials of the user

            ex:
                cydeo
                school

            output:
                C.S

        Note: Pay attention to the example output
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first word:");
        String word1 = scan.next();

        System.out.println("Enter the second word:");
        String word2 = scan.next();

        System.out.println(word1.substring(0,1).toUpperCase() + "." + word2.substring(0,1).toUpperCase());

        scan.close();
    }
}
