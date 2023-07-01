package week06.task3;

import java.util.Arrays;

public class Mustafa {
    /*
    Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
     */


    public static void main(String[] args) {


        String str =  "2java5apple93";
         int sum=0;
        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);
            if (Character.isDigit(ch))

                sum = sum+Integer.parseInt(String.valueOf(i));
        }
        System.out.println(sum);

    }
}
