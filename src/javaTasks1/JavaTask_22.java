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
        System.out.println("isAnagram(\"silent\", \"listen\") = " + isAnagram("silent", "listen"));


    }

    public static boolean isAnagram(String str1, String str2) {
        boolean result = false;
        String reverse = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            reverse += str1.charAt(i);

        }

        if (str2.equals(reverse)) {
            result = true;
        }
        return result;
    }

}


