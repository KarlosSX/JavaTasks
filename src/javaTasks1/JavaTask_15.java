package javaTasks1;

import java.util.Scanner;

public class JavaTask_15 {

    public static void main(String[] args) {

        /*
        Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scan.nextLine();           //"aabcccd"

        System.out.println("Enter a char:");
        char ch= scan.next().charAt(0);         // 'c'

        int freqCh = 0;

        for (int j = 0; j < str.length(); j++) {
            char eachChar = str.charAt(j);

            if (eachChar == ch){
                freqCh ++;
            }
        }

        System.out.println("freqCh = " + freqCh);

        scan.close();

    }
}
