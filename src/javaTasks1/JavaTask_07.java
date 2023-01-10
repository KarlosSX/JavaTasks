package javaTasks1;

import java.util.Scanner;

public class JavaTask_07 {

    public static void main(String[] args) {

        /*
        write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

           Do Not use if statement or ternary  USE SWITCH
         */

        Scanner scan = new Scanner(System.in);

        String result= "";

        System.out.println("Enter your browser name: ");
        String browserName = scan.next().toLowerCase();

        switch (browserName){
            case "chrome": case "firefox": case "opera": case "safari": case "edge":
                result = "Valid Browser";
                break;
            default:
                result = "Invalid Browser!";
        }

        System.out.println("result = " + result);

        scan.close();

    }
}
