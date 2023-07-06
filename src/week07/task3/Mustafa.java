package week07.task3;

public class Mustafa {
    /*
     Array_SortDescending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = sortDecending(arr); ==> {90, 20, 10, 8, 7};
     */
    public static void main(String[] args) {

        int[] arr = {10, 9, 4, 7,8,100};

        ascendingOrder(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static int[] ascendingOrder(int[] arr) {

        int temp;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
