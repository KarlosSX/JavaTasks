package javaTasks1;

import java.util.Arrays;

public class JavaTask_21 {

    public static void main(String[] args) {

        /*
        Write a program that can merge 3 arrays of integers

          Ex:
             arr1 = {30, 10, 20};
             arr2 = {15, 40, 25, 35};
             arr3 = {8, 9, 17, 5, 4, 1}

         Output:
            {30,10,20,15,40,25,35,8,9,17,5,4,1}
         */

        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};

        int[] result = new int[arr1.length + arr2.length + arr3.length];


        int j=0;
        for (int i = 0; i < arr1.length; i++,j++) {
            result[j] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++,j++) {
            result[j] = arr2[i];
        }

        for (int i = 0; i < arr3.length; i++,j++) {
            result[j] = arr3[i];
        }

        System.out.println(Arrays.toString(result));

        }
    }
