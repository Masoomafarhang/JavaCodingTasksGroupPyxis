package week03.task2;

import java.util.Scanner;

public class Masooma {
    /*
    Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your negative number");
        int number = input.nextInt();

        int reversed = reverseNegative(number);
        System.out.println("The reversed number is: " + reversed);

    }

    /**
     * Reverse the digits of any given numbers
     * @param number
     * @return
     */

    public static int reverseNegative(int number) {

        int reversed = 0;
        while (number != 0) { //231
            int digit = number % 10; //231%10= 1, 23%10=3, 2%10=2
            reversed = reversed * 10 + digit; // 1, 13,  132
            number /= 10; //231/10= 23, 23/10= 2 , 2/10=0
        }

        return  reversed;
    }
}


