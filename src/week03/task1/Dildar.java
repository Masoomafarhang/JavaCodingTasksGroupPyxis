package week03.task1;

public class Dildar {
    /* Numbers -- PrimeNumber
Write a method that can check if a number is prime or not

     */

public static boolean primeNumber(int num){
    if (num<2){
        return false;
    }
    for (int i = 2; i <num ; i++) {
        if (num%i==0){
            return false;
        }
    }
    return true;
}




}
