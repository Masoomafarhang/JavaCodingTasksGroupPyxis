package week04.task2;

import java.util.Arrays;

public class Masooma {
    /*
      String - Same letters
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
     */
    public static void main(String[] args) {
        System.out.println(same("abc", "cab"));
        System.out.println(same2("abc", "cba"));

    }

    /**
     * same letter verification
     * @param str1
     * @param str2
     * @return
     */
    public static boolean same(String str1, String str2){
        if (str1.length()!= str2.length()){
            return false;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);

    }
    public static boolean same2(String Str1, String Str2){
        if (Str1.length()!= Str2.length()){
            return false;
        }

        int[] charCount = new int[26]; // Assuming only lowercase letters are used

        for (int i = 0; i < Str1.length(); i++) {
            charCount[Str1.charAt(i) - 'a']++;
            charCount[Str2.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
