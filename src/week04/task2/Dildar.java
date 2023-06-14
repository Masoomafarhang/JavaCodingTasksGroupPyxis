package week04.task2;

import java.util.Arrays;

public class Dildar {
    /*Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false

     */
    public static void main(String[] args) {
        System.out.println("isSameLetters(\"abc\", \"cab\") = " + isSameLetters("abcs", "cabs"));
        System.out.println("isSameLetters(\"abc\", \"abb\") = " + isSameLetters("abc", "afb"));
    }

    public static boolean isSameLetters(String str1,String str2){
       String[] arr1= str1.split("");
       String[] arr2= str2.split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2)){
           return true;
      }
        return false;
    }

















}
