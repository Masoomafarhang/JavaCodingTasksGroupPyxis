package week06.task2;

import java.util.Arrays;

public class Masooma {
    /*
    Array_FindMaximum
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
     */

    public static void main(String[] args) {
        int[] arr = {-99, -12, -23, -32, -44, 0, -6};
        System.out.println(findMax(arr));

    }

    public static int findMax(int[] list){
        int max= Integer.MIN_VALUE;

        for (int i = 1; i < list.length; i++) {
            if (list[i]> max){
                max = list[i];
            }
        }
        return max;
    }
}
