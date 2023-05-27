package week01;

import java.util.Scanner;


public class DivideWithoutOperator{



    /*
    Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator
     */


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("please enter the dividend");
        int num1= input.nextInt();
        System.out.println("please enter the divisor");
        int num2= input.nextInt();
        int result1= 0;
        while (num1>= num2){
            num1 -= num2;
            result1++;
        }
        System.out.println("The result is: "+result1);
        System.out.println("the remainder is: "+num1);


        System.out.println("==========================");

      // withoutOperator(25,4);



        input.close();



        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println(divide(num1,num2));
        */

    }

    public static int divide(int num1, int num2){
        int result = 0;

        while(num1 >=num2){
            num1 -= num2;
            result++;
        }
        return result;
    }
    /*
    public static void withoutOperator(int dividend, int divisor){

        int result= 0;
        while (dividend>= divisor){
            dividend -= divisor;
            result++;
        }
        System.out.println(result);

    }
    */




}
