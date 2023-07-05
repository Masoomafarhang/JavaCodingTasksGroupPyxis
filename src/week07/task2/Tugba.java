package week07.task2;

import java.util.Arrays;

public class Tugba {
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10, 9, 8, 7};
    //arr = sortAscending(arr); ==>{ 7, 8, 9, 10};

    public static int[] sortAscending(int[] arr){

        int a = 0;
        for(int i =0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[i] > arr[j]) {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        System.out.println(Arrays.toString(sortAscending(arr)));
    }
}
