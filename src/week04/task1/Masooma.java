package week04.task1;

public class Masooma {
    /*
      String - Frequency of Characters`
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void main(String[] args) {
        System.out.println(frequency("AAABBCDD"));


    }

    /**
     * Method for frequency of characters
     * @param str
     * @return
     */
    public static String frequency(String str){
        String result= "";
        for (int m = 0; m < str.length(); m++) {
            char ch2= str.charAt(m);
            int count= 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch2){
                    count ++;
                }
            }
            if (result.contains(""+ch2)){ //it says if the result contains the character,
                continue;//it should skip and go to the next one
            }
            result+= ch2 + ""+ count; //char and count will be summed together, so we need to change one of them to string

        }

        return result;
    }
}
