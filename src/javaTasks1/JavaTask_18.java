package javaTasks1;

public class JavaTask_18 {

    public static void main(String[] args) {
        /*
        Write a program that can find the frequency of the characters from a string

          Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

        Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
         */

        String str = "aabcccd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int freqCh = 0;

            for (int i = 0; i < str.length(); i++) {
                char eachChar = str.charAt(i);

                if (eachChar == ch) {
                    freqCh++;
                }
            }

            if (!(result.contains("" + ch))) {
                result += ch;
                result += freqCh;

            }
        }

        System.out.println("result = " + result);
    }
}
