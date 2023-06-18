package week03.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Ahtem {
    /*
         Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
         */
    public static void main(String[] args) {

int a = negativeNumberReverse(-59);
        System.out.println(a);
    }

    public static int negativeNumberReverse(int a) {
        int reverse = 0;
        while (a <0 ){
            reverse=reverse*10+a%10;
            a/=10;
        }

return reverse;
    }
}


