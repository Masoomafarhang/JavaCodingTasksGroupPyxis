package week06.task2;

import java.util.Arrays;

public class Omer {

    public static void main(String[] args) {

        int arr1[]={1,2,3,4,5,6,5,5,5,45,5,5,5,5,45,34,5345};
        System.out.println( MaxNumber(arr1));

        }

        public static int MaxNumber (int[] arr){
        Arrays.sort(arr);
           return arr[arr.length-1];
        }



    }


/* Array_FindMaximum
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99*/