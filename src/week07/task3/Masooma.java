package week07.task3;

import java.util.Arrays;

public class Masooma {

    /*
    Array_SortDescending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = sortDecending(arr); ==> {90, 20, 10, 8, 7};
     */

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};

        System.out.println(Arrays.toString(sortDescending1(arr)));
        System.out.println(Arrays.toString(sortDescending2(arr)));
    }

    public static int[] sortDescending1(int... arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }


    public static int[] sortDescending2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;

            // Find the index of the maximum element in the remaining unsorted portion
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap the maximum element with the current element
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

}
