package week04.task2;

import java.util.Arrays;

public class task2 {
    //Write a return method that checks if a string is built out of the same letters as another string.
    //  Ex: same("abc", "cab"); ==> true
    //      same("abc", "abb"); ==> false
    public static void main(String[] args) {

        System.out.println(sameLetterOrNot("abc", "bcg"));

    }

    public static boolean sameLetterOrNot(String str1, String str2) {

        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        return Arrays.equals(arr1, arr2);


    }
}