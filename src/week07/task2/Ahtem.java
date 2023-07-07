package week07.task2;


//Array_SortAscending
//        Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
//Ex: int[] arr = {10, 9, 8, 7};
//        arr = sortAscending(arr); ==>{ 7, 8, 9, 10};

import java.util.ArrayList;

import java.util.Collections;

public class Ahtem {


    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        ArrayList<Integer> nums = new ArrayList<>();
        for (int num : arr) {
            nums.add(num);
        }

        Collections.sort(nums);
        System.out.println(nums);
    }

}
