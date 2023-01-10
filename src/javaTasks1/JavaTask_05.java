package javaTasks1;

import java.util.Scanner;

public class JavaTask_05 {

    public static void main(String[] args) {

        /*
        Create a class called GradeLevel, Given a number(byte) grade level determine and
print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your grade level: (1 ~ 18)");
        byte level = scan.nextByte();

        String schoolType = "";

        if (level<1 || level>18){
            System.out.println("Invalid grade number entry!");
        }else {
            if (level>=1 && level<=5){
                schoolType = "Elementary school";
            } else if (level>=6 && level<=8) {
                schoolType = "Middle school";
            }else if (level>=9 && level<=12) {
                schoolType = "High school";
            }else if (level>=13 && level<=16) {
                schoolType = "College";
            }else {
                schoolType = "Grad School";
            }

            System.out.println("gradeLevel = " + schoolType);

            scan.close();
        }
    }
}
