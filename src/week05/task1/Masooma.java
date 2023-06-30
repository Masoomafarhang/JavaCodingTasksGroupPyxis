package week05.task1;

import java.util.Scanner;

public class Masooma {
    //String - Find the unique
    //Write a return method that can find the unique characters from the String
    // Ex: unique("AAABBBCCCDEF") ==> "DEF";
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your word");
        String word= input.next();


        System.out.println("The unique charactrs are: "+unique(word));


    }

    public static String unique(String str){

        String result= "";
        for (int i = 0; i < str.length(); i++) {
            char each= str.charAt(i);
            if(str.indexOf(each) == str.lastIndexOf(each)){
                result +=each;

            }


        }
        return result;
    }
}
