package week04.task2;

import java.util.Arrays;

public class Mustafa {
    /*
    String - Same letters
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
     */

    public static void main(String[] args) {
        sameLetters("cab","avb");
    }

    public static void sameLetters(String str1, String str2) {
        boolean isSame = false;


        char[] chars1 = str1.toLowerCase().toCharArray();
        char[] chars2 = str2.toLowerCase().toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        if (Arrays.equals(chars1, chars2)) {
            isSame = true;
        }

        System.out.println("isSame = " + isSame);

    }
}