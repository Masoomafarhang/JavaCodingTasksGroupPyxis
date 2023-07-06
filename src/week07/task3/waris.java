package week07.task3;

import java.util.Arrays;

public class waris {
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10,20,7, 8, 90};
    //arr = sortDecending(arr); ==> {90, 20, 10, 8, 7};
    public static int[] sortDecending(int[] arr){

        int a = 0;
        for(int i =0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[i] < arr[j]) {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(sortDecending(arr)));
    }

}
