package week06.task2;

public class Mustafa {
    /*
    Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
     */

    public static void main(String[] args) {
       int[] arr= {2,3,333,5,9,7,5,100,299};

        System.out.println("maxNum(arr) = " + maxNum(arr));

    }
    public static int maxNum(int[] nums) {

        int max = 0;
        for (int each : nums) {

            if (max < each) {


                max = each;
            }

        }

        return max;
    }


}
