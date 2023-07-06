package week07.task1;

public class Mustafa {
    /*
     Array_FindMinimum
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */

    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};

        System.out.println("findMin(arr) = " + findMin(arr));

    }

    public static int findMin(int[] arr) {


        int min = Integer.MAX_VALUE;


        for (int each : arr) {

            if (each < min) {

                min = each;
            }


        }

        return min;

    }
}
