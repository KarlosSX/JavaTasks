package javaTasks1;

public class JavaTask_22 {

    public static void main(String[] args) {
        /*
            create a method that can check if two strings are anagram
                  ex:
                     anagram("silent", "listen")


            output:
               silent and listen are anagram
         */
        anagram("silent", "listen");


    }

    public static String anagram(String str1, String str2) {

        String reverse = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            reverse += str1.charAt(i);

        }

        if (str2.equals(reverse)) {
            boolean result;
            result()

        }
    }

}


