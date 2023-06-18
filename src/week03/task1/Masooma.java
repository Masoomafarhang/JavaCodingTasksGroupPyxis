package week03.task1;

import java.util.Scanner;

public class Masooma {
    /*
    Numbers -- PrimeNumber
Write a method that can check if a number is prime or not
     */

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number");
        int number= input.nextInt();
        if (number<=1){
            System.out.println("Enter numbers more than 1");
            System.exit(1);
        }

        System.out.println("Is "+ number+" a prime number? "+isPrime(number));
    }

    /**
     * Returns any given numbers is they are prime or not.
     * @param number
     * @return
     */
    public static boolean isPrime(int number){


        for (int i=2; i<= number/2; i++){ //n= 13, i= 2-6

            if (number %i == 0){ //13/2, 13/3, 13/4, 13/5, 13/6
                return false;
            }
        }

      return true;
    }

}
