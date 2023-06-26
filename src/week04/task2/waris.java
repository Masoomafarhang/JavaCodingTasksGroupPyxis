package week04.task2;

import java.util.Arrays;

public class waris {
    public static void main(String[] args) {

        System.out.println(sameLetterOrNot("abc", "cba"));

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
