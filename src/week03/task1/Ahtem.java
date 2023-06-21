package week03.task1;

public class Ahtem {
    public static void main(String[] args) {

     /*1️⃣ Numbers -- PrimeNumber
        Write a method that can check if a number is prime or not */
    primeNumber(13);
    }
        public static void primeNumber(int a){
        int count =0;
        for (int i = 1; i < a; i++) {
            if((a % i == 0 )){
                count++;
            }
            }if (count==1){
                System.out.println(a + " is a PrimeNumber");
            }else {
                System.out.println(a + " is not a prime number");
            }
        }
    }





/*2️⃣ Numbers -- Reverse Negative Number
        Write a return method that can reverse digits of a negative number and return it as int
        input: -35  output: -53

      */