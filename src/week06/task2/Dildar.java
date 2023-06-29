package week06.task2;

public class Dildar {
    /*  Array_FindMaximum
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99

     */


    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println("findMaximum( arr ) = " + findMaximum(arr));
    }
    public static int findMaximum(int[] arr){
        int maxNum=0;
        for (int each: arr) {
           if (each>maxNum){
               maxNum=each;
           }
        }
        return maxNum;
    }












}
