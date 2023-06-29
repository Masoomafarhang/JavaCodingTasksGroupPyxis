package week06.task3;

import java.util.Scanner;

public class Masooma {
    /*
    String_SumOfAllDigits
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
     */
    public static void main(String[] args) {
        System.out.println("The sum of all digits is = " + sumOfAllDigits("100 java5 10 apple 9"));


    }

    public static int sumOfAllDigits(String str){
        int sum = 0;
        int currentNumber = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (each == ' ') {
                if (currentNumber > 0) {
                    sum += currentNumber;
                    currentNumber = 0;
                }
            } else if (Character.isDigit(each)) {
                currentNumber = currentNumber * 10 + (each- '0');
            }
        }

        if (currentNumber > 0) {
            sum += currentNumber;
        }

        return sum;


    }
}
