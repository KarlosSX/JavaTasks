package javaTasks1;

import java.util.Scanner;

public class JavaTask_12 {

    public static void main(String[] args) {

        /*
        Create a class called Travel. Make a cost variable to calculate how much the person will owe after everything.
      Ask the user if they have a valid passport (yes or no)
         If the user enters yes:
               The base cost of the ticket should be set to: 1000
                  Ask the user the country they to travel to (String, multiple word)
                  Ask the user how many bags they will take with them (byte)
                         > Each bag will add 50 to the cost
                  Ask the user how many people they will travel with (short)
                         > For each person the cost is reduced by 100. Up to a limit of 300.
                  Ask the user to Enter the name of the people they will travel with in one line, separating each name with a comma (String, multiple word)

                  Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags bags, but you are traveling with $peopleYouTravelWith
                  so we are giving a discount. Your total cost is $costAmount"


          If the user enters no:
                The base cost of the passport renewal is: 200
                  Ask the user when their passport expired(int)
                      > Each year it was expired adds 75 to the cost
                 Ask the user which country they plan to travel
                  Ask the user if they will be traveling in the next year (String - yes or no)
                      > If yes: add 100 to the cost
                      > If no: subtract 50 from the cost

                 Print: "Looks like your password has been expired for $years, but not to worry we will get it ready for you to travel to $allCountries.
                 Your total cost has come out to $costAmount."
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Have you got a valid passport? (yes/no)");
        String answer = scan.next().toLowerCase();

        if (answer.equals("yes")) {

            int baseCost = 1000;
            int add_Discount= 0;

            scan.nextLine();

            System.out.println("Which country are you traveling to?");
            String country = scan.nextLine();

            System.out.println("How many bags have you got?");
            byte bags = scan.nextByte();

            add_Discount += bags * 50;

            System.out.println("How many people will you travel with?");
            short people = scan.nextShort();

            if (people <= 2) {
                add_Discount -= people * 100;
            } else {
                add_Discount -= 300;
            }

            scan.nextLine();

            System.out.println("Enter the names of the passengers? (in one line, separating each name with a comma)");
            String passengers = scan.nextLine();

            System.out.println("Your ticket is booked to " + country + ". We have charged extra for the " + bags + " bags, but you are traveling with " + people +
                    " so we are giving a discount. Your total cost is $" + (baseCost + add_Discount));

        } else {

            int baseCost = 200;
            int add_Discount = 0;

            System.out.println("When did your passport expired?");
            int expiredYear = scan.nextInt();
            int years = 2023-expiredYear;

            add_Discount += (years * 75);

            scan.nextLine();

            System.out.println("Which country are you traveling to?");
            String country = scan.nextLine();

            System.out.println("Are you going to travel in the next year? (yes/no)");
            String answr = scan.next().toLowerCase();

            if (answr.equals("yes")){
                add_Discount += 100;
            }else{
                add_Discount -= 50;
            }

            System.out.println("Looks like your password has been expired for " + years + " years, but not to worry we will get it ready for you to travel to " + country +
                    ". Your total cost has come out to " + (baseCost + add_Discount));

        }

        scan.close();
    }
}
