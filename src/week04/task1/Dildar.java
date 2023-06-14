package week04.task1;





public class Dildar {
    /*String - Frequency of Characters`
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {
        System.out.println("frequencyOfChars(\"AAABBCDD\") = " + frequencyOfChars("AAABBCDD"));

    }

    public static String frequencyOfChars(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {//"AAABBCDD") ==> A3B2C1D2
            int count = 0;
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if ( !(result.contains(str.charAt(i)+""))){
                result+=str.charAt(i)+""+count;
            }
        }
        return result;
    }

}



