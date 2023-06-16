package week04.Task1;

public class Mustafa {
    /*
     String - Frequency of Characters`
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {

        frequencyOfChars("AACCCVVV");
    }


    public static void frequencyOfChars(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char each = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {

                char each2 = str.charAt(j);

                if (each == each2) {

                    count++;

                }
            }

            if (!(result.contains(each + ""))) {

                result += each + "" + count;

            }

        }


        System.out.println(result);

    }
}
