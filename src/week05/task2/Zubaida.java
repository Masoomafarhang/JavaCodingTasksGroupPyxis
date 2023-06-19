package week05.task2;

public class Zubaida {

    /*Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {

        String str = "ABCD";
        //            0123
      /*  String reverse = ""; //"DCBA"

        for (int i = str.length() - 1; i >= 0; i--) { // i: index number of the given string starting from last index to index 0
            reverse += str.charAt(i);  // to get each character of the string starting from last index to index zero
        }




        System.out.println(reverse);

       */

        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }


}
