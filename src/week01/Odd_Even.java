package week01;

import java.util.Scanner;

public class Odd_Even {

    public static void main(String[] args) {
        System.out.println("please enter a random number : ");  // this is solution 2 -adding scanner ()
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();


        if (num % 2 == 0) {
            System.out.println(num + " is a even number ");

        } else {
            System.out.println(num + " is odd number ");
        }


        //below one is solution 1 , basic solution

           /* int num = 6;
            if(num%2==0){
                System.out.println(num+" is a even number ");

            }else {
                System.out.println(num+" is odd number ");
            }
          */
    }

    }


   /*
Numbers-Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
 */