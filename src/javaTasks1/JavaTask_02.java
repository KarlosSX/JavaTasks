package javaTasks1;

import java.util.Scanner;

public class JavaTask_02 {

    public static void main(String[] args) {

        /*
        Create a class called Character Identity, and write a program that can identify if
the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

      Ex:
         ch = '@'

      output:
         Special Character
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a character:");
        char ch = scan.next().charAt(0);

        if (ch>= 'a' && ch<='z'){
            System.out.println(ch + " is a  alphabetic Character");
        } else if (ch>= 'A' && ch<='Z') {
            System.out.println(ch + " is a  alphabetic Character");
        } else if (ch>= '0' && ch<='9') {
            System.out.println(ch + " is a  digit");
        } else {
            System.out.println(ch + " is a  special characterr");
        }

        scan.close();


    }
}
