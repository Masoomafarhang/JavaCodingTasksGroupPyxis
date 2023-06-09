package week03.task1;

public class Zubaida {
      /*
    Numbers -- PrimeNumber
Write a method that can check if a number is prime or not
     */

// a number is a prime number when it is only divisible by 1 and itself.


    /**
     * Returns any given number is prime or not.
     * @param args
     */

    public static void main(String[] args) {
        int num = 13;
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                isPrime = false;
                break;

            }
        }

        System.out.println(isPrime);

    }
}
