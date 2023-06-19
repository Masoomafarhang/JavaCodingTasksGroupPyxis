package week05.task1;

public class Zubaida {

    /*Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */


    public static String uniqueCharacter(String str1){


        String unique = "";

        for (int i = 0; i < str1.length(); i++) {
            char each = str1.charAt(i);

            if (str1.indexOf(each) == str1.lastIndexOf(each)) {
                unique += each;
            }
        }

        return unique;
    }
    public static void main(String[] args) {

        System.out.println(uniqueCharacter("AAABBBCHHDKKFEHHCBBBAAA"));


    }


  /*  public static void main(String[] args) {

        String str = "aabcccd";

        String unique = "";


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // a
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) { // checks how many times the ch has appeared in str
                if(str.charAt(i) == ch ){ //if the ch has appeared in the string
                    frequency++; // increase the frequency by 1
                }
            }

            if(frequency == 1){ // if the frequency is one, then it's unique
                unique += ch;
            }

        }


        System.out.println(unique);

    }

   */


}
