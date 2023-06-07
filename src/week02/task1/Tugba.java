package week02.task1;

import java.util.Scanner;

public class Tugba {
    /*
   ========== Numbers -- Swap Numbers =========
   Swap two variable values without using a third variable
   */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = input.nextInt();
        System.out.println("Before swapping num1: " + num1 + " num2 : " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After  swapping num1: " + num1 + " num2 : " + num2 );
    }
}
