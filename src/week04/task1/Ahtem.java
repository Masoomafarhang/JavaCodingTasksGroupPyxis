package week04.task1;

import java.util.Arrays;

public class Ahtem {

    public static void main(String[] args) {
        frequencyOfCharacters("AAABBCC");


    }

 public static void frequencyOfCharacters (String str) {
        String result ="";

     for (int i = 0; i < str.length(); i++) {
         char ch= str.charAt(i);
         int count =0;

         for (int j = 0; j<str.length();j++){

             if (ch == str.charAt(j)){
                 count ++;
             }

         } if (result.contains(""+ch)){
         continue;}
         result+=ch+""+count;

         }
     System.out.println(result);

     }
 }


 /*
   String str = "aabcccd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }

            }
            if(result.contains(""+ch)){
                continue;
            }

            result += ch +""+ count;

        }
        System.out.println(result);
    }}
  */