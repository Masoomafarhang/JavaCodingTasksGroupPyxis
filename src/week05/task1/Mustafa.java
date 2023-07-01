package week05.task1;

public class Mustafa {
//    /*
//    Write a return method that can find the unique characters from the String
// Ex: unique("AAABBBCCCDEF") ==> "DEF";
//     */

    public static void main(String[] args) {

        System.out.println(UniqueNum("AAABBBCCCDEF"));
    }

    public static String UniqueNum (String str){

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                unique += ch;

            }
        }



    return unique;
}

}