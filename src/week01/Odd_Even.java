package week01;

import java.util.Scanner;

public class Odd_Even {
    /*
Numbers-Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
 */
    public static void main(String[] args) {
     EvenOrOdd(6);
    }
   public static void EvenOrOdd(int num ) {
       if (num % 2 == 0) {
           System.out.println(num + " is Even");
       } else {
           System.out.println(num + " is Odd");
       }
   }
}
