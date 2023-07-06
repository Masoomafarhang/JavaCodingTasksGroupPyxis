package week07.task1;

public class Zubaida {
    /*1️⃣  Array_FindMinimum
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */

    /**
     * Find the minimum number
     */

    static int arr[] = {99, 12, 23, 32, 44, 57, 6};

    static int smallest () {
        int i;
        int minimum = Integer.MAX_VALUE;

        for (i = 0; i < arr.length; i++)
            if (arr[i] < minimum)
                minimum = arr[i];

        return minimum;
    }

    public static void main(String[] args) {
        System.out.println("Smallest in given array is " + smallest());

    }
}
