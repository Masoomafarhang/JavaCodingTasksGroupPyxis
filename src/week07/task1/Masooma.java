package week07.task1;

public class Masooma {
    /*
    Array_FindMinimum
    Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */


    public static void main(String[] args) {
        int[] arr= {2, 0, 23, 32, 89, 57, 6};
        System.out.println(findMinimum(arr));

    }
    public static int findMinimum(int[] arr){
        int min= Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]< min){
                min = arr[i];
            }
        }
        return min;
    }




}
