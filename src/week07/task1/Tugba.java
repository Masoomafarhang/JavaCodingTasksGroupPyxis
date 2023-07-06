package week07.task1;

import java.util.Arrays;

public class Tugba {

    //Write a method that can find the minimum number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6


    public static int minNumber(int[] arr){
        Arrays.sort(arr);
        int min = arr[0];
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(minNumber(arr));
    }
}
