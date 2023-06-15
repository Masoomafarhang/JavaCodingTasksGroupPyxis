package week04.task3;

import java.util.Scanner;

public class Zubaida {

    /* Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC

     */

    public static void main(String[] args) {


        String str = "AABCCCDDDFFRR";

        String result = "";


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each character from string
            if (result.contains("" + ch)) {
                continue;
            }
            result += ch;
        }
        System.out.println(result);

    }
}
