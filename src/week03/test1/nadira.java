package week03.test1;

public class nadira {

    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if (num % i==0){
                return false;
            }

        }
        return true ;

    }

    public static void main(String[] args) {
        System.out.println("is prime number = "+ isPrime(13));
    }
}
/*
Numbers -- PrimeNumber
Write a method that can check if a number is prime or not
 */