package javaTasks1;

public class JavaTask_20 {

    public static void main(String[] args) {

        /*
        Given the following arrays: COPY PASTE THE ARRAYS
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
         */

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPh12"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};


        int firstIndexOfGloves = 0;

        for (String each : items) {

            if (each.equals("Gloves")) {
                break;
            }

            firstIndexOfGloves++;
        }
        System.out.println("First Index Of Gloves = " + firstIndexOfGloves);

        System.out.println("--------------------------------------------------------------------");

        boolean iPadIsExist = false;

        for (String each : items) {

            if (each.equals("iPad")) {

                iPadIsExist = true;
            }
        }
        System.out.println("iPadIsExist = " + iPadIsExist);

        System.out.println("---------------------------------------------------------------------");

        String report = "";

        for (int i = 0; i < items.length; i++) {

            report += items[i] + "\t- " + prices[i] + "\t- " + itemIDs[i] + "\n";
        }

        System.out.println(report);

    }
}

