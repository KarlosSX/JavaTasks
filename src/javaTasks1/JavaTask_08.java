package javaTasks1;

import java.util.Scanner;

public class JavaTask_08 {

    public static void main(String[] args) {

        /*
        Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
         Valid sizes are tall, grande, venti and their price & calories are:

                  tall:
                        price is $3.69
                        90 calories

                  grande:
                        price is $3.99;
                        120 calories

                  venti:
                        price is $4.29
                        150 calories

         If the size is invalid then the output should be "Invalid Size"
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your size preference: ( tall / grande / venti )");
        String size = scan.next().toLowerCase();

        double price = 0;
        int calories = 0;

        if (!(size.equals("tall") || size.equals("grande") || size.equals("venti"))) {
            System.out.println("Invalid Size!");
        } else {
            switch (size) {
                case "tall":
                    price = 3.69;
                    calories = 90;
                    break;
                case "grande":
                    price = 3.99;
                    calories = 120;
                    break;
                default:
                    price = 4.29;
                    calories = 150;
            }

            System.out.println("Size:" + size + "  Price:$" + price + "  Calories:" + calories);
        }

        scan.close();

    }
}
