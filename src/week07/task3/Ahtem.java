package week07.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ahtem {




        public static void main(String[] args) {
            int[] arr2 = {10, 20, 7, 8, 90};
            System.out.println(Arrays.toString(reversed(arr2)));

        }
        public static int [] reversed (int [] array){

            ArrayList<Integer> nums = new ArrayList<>();

            for (int num : array) {
                nums.add(num);
            }

            Collections.sort(nums);


            Collections.reverse(nums);
            for (int i = 0; i < nums.size(); i++) {
                array[i]=nums.get(i);
            }
            return array;
        }

    }
