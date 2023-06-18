package week04.task3;

public class Masooma {
    /*
    String - Remove Duplicates
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {
        System.out.println(duplicate("AAABBBCCC"));


    }

    /**
     * Remove duplicated letters from the string
     * @param str
     * @return
     */

    public static String duplicate(String str) {

        String result = ""; //it will store the abc
        for (int i = 0; i < str.length(); i++) { //i: index numbers of str
            char each = str.charAt(i); //each character of the string str
            if (!result.contains("" + each)) { //if the string result doesnt contain the character of string str yet
                result += each; //then we will add the character to string result
            }
        }
        return result;
    }




}
