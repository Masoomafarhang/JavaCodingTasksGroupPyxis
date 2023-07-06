package week07.task2;

import java.util.Arrays;

public class Mustafa {
   /* Array_SortAscending
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays

    class
    Ex: int[] arr = {10, 9, 8, 7};
    arr = sortAscending(arr); ==>{ 7, 8, 9, 10};*/


    public static void main(String[] args) {

        int[] arr = {10, 9,20,40,10, 8, 7};
         //           0  1  2  3
        // 1th        +   + +   +
        //                +  +   +



        ascendingOrder(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static int[] ascendingOrder(int[] arr) {

        int temp;

        for (int i = 0; i < arr.length; i++) { //

            for (int j = i +1  ; j < arr.length; j++) { //9
                //   10          9
                if (arr[i]  > arr[j]) {
                    //10     0
                    temp = arr[i];
                    // 9       0
                    arr[i] = arr[j ];
                    // 10      0
                    arr[j] = temp;

                    //{9, 8, 17, 10}


                }


            }

        }

        return arr;
    }


}




