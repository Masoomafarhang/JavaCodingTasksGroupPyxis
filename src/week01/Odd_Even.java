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
        Scanner input= new Scanner(System.in);
         int number= input.nextInt();

         if (number %2 == 0){
             System.out.println("Even number: "+number);
         }else {
             System.out.println("Odd number: "+number);
         }

         input.close();




        identify(6);

    }

    public static void identify(int num){
        if(num % 2 ==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

}
