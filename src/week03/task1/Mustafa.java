package week03.task1;

public class Mustafa {
   /* Numbers -- PrimeNumber
    Write a method that can check if a number is prime or not */

    public static void main(String[] args) {
        int num = 25;

        if (primNumber(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

    }

    public static boolean primNumber(int num) {


        for (int i = 2; i < num; i++) {

            if (num % i == 0) {


                return false;
            }
        }

        return true ;
    }
}