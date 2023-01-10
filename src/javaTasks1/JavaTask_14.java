package javaTasks1;

public class JavaTask_14 {

    public static void main(String[] args) {

        /*
        write a program that can retrieve the digits, letters and special characters from a string
           Ex:
               input:
                   mn@#123Ab!

               output:
                   letters: mnAb
                   digits: 123
                   special chars: @#!
         */

        String word = "mn@#123Ab!";

        String letters = "";
        String digits = "";
        String specialCh = "";

        for (int j = 0; j < word.length(); j++) {
            char ch = word.charAt(j);

            if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                letters += ch;
            }else if (ch >='0' && ch<='9'){
                digits += ch;
            }else{
                specialCh += ch;
            }
        }

        System.out.println("letters : " + letters);
        System.out.println("digits : " + digits);
        System.out.println("special chars : " + specialCh);

    }
}
