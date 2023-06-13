package week04.task2;

import java.util.Arrays;

public class Ahtem {
    //2️⃣  String - Same letters
    //Write a return method that checks if a string is built out of the same letters as another string.
    //  Ex: same("abc", "cab"); ==> true
    //      same("abc", "abb"); ==> false
    //

    public static void main(String[] args) {
        System.out.println(ifsameletteres("abc", "badc"));

    }
   public static boolean ifsameletteres (String str1, String str2){
       boolean ifsame= false;

       char [] ch = str1.toLowerCase().toCharArray();
       char[]ch1=str2.toLowerCase().toCharArray();
       Arrays.sort(ch);
       Arrays.sort(ch1);
       if(String.valueOf(ch).equals(String.valueOf(ch1))){
        ifsame=true;

        }return ifsame;

    }



}
