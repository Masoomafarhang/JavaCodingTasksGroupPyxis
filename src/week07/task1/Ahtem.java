package week07.task1;



import java.util.Arrays;

//Array_FindMinimum
//Write a method that can find the minimum number from an int Array
//Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
public class Ahtem {
    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        minimumNumberFromIntArray(arr);
    }

public static void minimumNumberFromIntArray(int [] array){

    System.out.println("Minimum number is: " + Arrays.stream(array).min().getAsInt());

}
}
