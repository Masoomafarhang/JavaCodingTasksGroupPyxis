package week01;

import java.util.ArrayList;
import java.util.Scanner;

public class FINRA {
    /*
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.
 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String yesNo = "yes";
        while (yesNo.equals("yes")) {

            System.out.println("Please enter a number between 1 to 30");
            int num = input.nextInt();

            while (num <0 || num>30){
                System.out.println("Please enter number 1-30");
                num=input.nextInt();
            }


                if (num % 3 == 0 && num % 5 == 0) {
                    System.out.println("FINRA");
                } else if (num % 5 == 0) {
                    System.out.println("RA");
                } else if(num % 3 == 0) {
                    System.out.println("FIN");
                }


            System.out.println("Would you like to enter another number Yes / No");
            yesNo = input.next().toLowerCase();

            while(!(yesNo.equals("yes") || yesNo.equals("no"))) {
                System.out.println("Invalid entry. Would you like to enter another number? Yes/No");
                yesNo=input.next().toLowerCase();
            }

        }
    }
}

