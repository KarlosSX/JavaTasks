package javaTasks1;

import java.util.Scanner;

public class JavaTask_03 {

    public static void main(String[] args) {

        /*
        Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank
has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at 50%

                USE ONE PRINT STATEMENT ONLY
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your oxygen tank number: (0 ~ 100)");
        int number = scan.nextInt();

        String level ="";

        if (number>=90){
            level = "Your tank is full";
        } else if (number>=80) {
            level = "Still okay";
        }else if (number>=70) {
            level = "Don't go too far";
        }else if (number>=60) {
            level = "Start to head back";
        }else {
            level = "Be careful now you at 50%";
        }

        System.out.println("level = " + level);

        scan.close();
    }
}
