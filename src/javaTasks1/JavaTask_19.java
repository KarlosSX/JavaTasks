package javaTasks1;

public class JavaTask_19 {

    public static void main(String[] args) {

        /*
        Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
            ALSO DO THIS SAME EXAMPLE WITH FOR EACH LOOP AS WELL
         */

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        String commons = "";

        for (int i = 0; i < arr1.length; i++) {
            int number = arr1[i];

            for (int j = 0; j < arr2.length; j++) {
                int eachNumber = arr2[j];

                if (eachNumber == number) {

                    commons += number;
                    commons += " ";
                }
            }
        }

        System.out.println("commons = " + commons);

        System.out.println("------------------------------------------------------");

        for (int num: arr1){

            for (int eachNum : arr2) {

                if (eachNum==num){

                    commons += num;
                    commons += " ";
                }

            }
        }

        System.out.println("commons = " + commons);

    }
}

