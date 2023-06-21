package week05.task1;

public class Dildar {

    /*  String - Find the unique
Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";


     */
    public static void main(String[] args) {
        System.out.println("unique(\"AAABBBCCCDEF\") = " + unique("AAABBBCCCDEF"));
    }
    public static String unique(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if (count==1 &&(!result.contains(str.charAt(i)+""))){
                result+=str.charAt(i);
            }
        }
        return result;
    }


}
