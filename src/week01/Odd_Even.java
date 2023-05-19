package week01;

import java.util.Scanner;

/*
Numbers-Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
*/
public class Odd_Even {

    public static void main(String[] args) {

        System.out.println(oddOrEvenNum(2));

    }

    public static String oddOrEvenNum(int num) {


        if (num % 2 == 0) {

            return "This number is even number";

        } else {

            return "This number is odd number";
        }


    }


}
