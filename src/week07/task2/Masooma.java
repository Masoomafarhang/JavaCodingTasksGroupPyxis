package week07.task2;


import java.util.Arrays;


public class Masooma {

    /*
    Array_SortAscending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
     */

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};

        System.out.println(Arrays.toString(sortAscending1(arr)));
        System.out.println(Arrays.toString(sortAscending2(arr)));


    }

    public static int[] sortAscending1(int... arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }


    public static int[] sortAscending2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the remaining unsorted portion
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the current element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }




}
