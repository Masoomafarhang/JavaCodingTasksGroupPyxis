package week05.task2;

import java.util.Scanner;

public class Masooma {
    // String -- Reverse
    //Write a function that can reverse a String
    // Ex: Reverse("ABCD"); ==> DCBA
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your word");
        String word= input.next();
        System.out.println("The reversed of the word is: "+reverse(word));

    }
    public static String reverse(String str){
        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);

        }
        return reverse;
    }
}
