package week05.task1;

import java.util.zip.ZipFile;

public class Waris {
    //Write a return method that can find the unique characters from the String
    // Ex: unique("AAABBBCCCDEF") ==> "DEF";
    public static void main(String[] args) {
        findTheUnique("AAABBBCCCDEF");


    }

    public static void findTheUnique(String str) {
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)) {

                unique += each;
            }
        }
        System.out.println("unique(" + str + ") ==>" + unique);


    }


}