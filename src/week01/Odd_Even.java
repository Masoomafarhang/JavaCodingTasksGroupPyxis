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

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your number");

        int num = input.nextInt();
        if(num%2==0){
            System.out.println(num + " is even number");
        }else {
            System.out.println(num + " is odd number");
        }
input.close();
    }

}
