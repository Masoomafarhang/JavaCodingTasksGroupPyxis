package week04.task2;
import java.util.Arrays;

import static week04.task1.Dildar.frequencyOfChars;

public class dildar {
    /*Write a return method that checks if a string is built out of the same letters as another string.
      Ex: same("abc", "cab"); ==> true
          same("abc", "abb"); ==> false

         */
    public static void main(String[] args) {
        System.out.println("isSameLetters(\"abc\", \"cab\") = " + isSameLetters("abcs", "cabs"));
        System.out.println("isSameLetters(\"abc\", \"abb\") = " + isSameLetters("abc", "afb"));
        String str1="abc",str2="cab";
        System.out.println("isSameLetters2(str1,str2) = " + isSameLetters2(str1, str2));
        System.out.println("isSameLetters3(str1,str2) = " + isSameLetters3(str1, str2));
        System.out.println("frequencyOfChars(str1) = " + frequencyOfChars(str1));
        System.out.println("frequencyOfChars(str2) = " + frequencyOfChars(str2));
    }

    public static boolean isSameLetters(String str1,String str2){
       String[] arr1= str1.split("");
       String[] arr2= str2.split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static boolean isSameLetters2(String str,String str1){
        String result1 = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if ( !(result1.contains(str.charAt(i)+""))){
                result1+=str.charAt(i)+""+count;
            }
        }
        System.out.println(result1);
        String result2 = "";
        for (int i = 0; i < str1.length(); i++) {
            int count = 0;
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    count++;
                }
            }
            if ( !(result2.contains(str1.charAt(i)+""))){
                result2+=str1.charAt(i)+""+count;
            }
        }
        System.out.println(result2);
        return result1.equals(result2);
    }

    public static boolean isSameLetters3(String str,String str1) {

        return frequencyOfChars(str).equals(   frequencyOfChars(str1));
    }
}
