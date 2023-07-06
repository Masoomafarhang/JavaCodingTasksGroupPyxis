package week07.task2;

import java.util.Arrays;

public class Zubaida {

    /*2️⃣  Array_SortAscending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
     */

    /**
     * Sorting an int array in Ascending order
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortAscending(10, 9, 8, 7)));
    }
    public static int[] sortAscending(int... arr){
        for (int i = 0; i < arr.length; i++){

            for (int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
