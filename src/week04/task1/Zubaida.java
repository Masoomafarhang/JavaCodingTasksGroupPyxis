package week04.task1;

import java.util.Scanner;

public class Zubaida {

    /*
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

    /**
     * Returns the frequency of characters
     *
     * @param args
     */

    public static void main(String[] args) {

      //  String str = "AABCCCD";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = input.next();

        String result = ""; //a2b1c3d1


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each character from string
            int count = 0;

            for (int i = 0; i < str.length(); i++) { //to find the frequency of each character

                char each = str.charAt(i); // each character of str
                if (ch == each) {
                    count++;
                }
            }

            if (result.contains("" + ch)) {
                continue;
            }


            result += ch;
            result += count;
        }


        System.out.println(result);

    }

}



/*
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
